import gen.*;
//TODO: Make switch cases instead else if for some places
public class ASTVisitor extends SpoGrammarBaseVisitor <StmtNode>{
    @Override
    public StmtNode visitStart(SpoGrammarParser.StartContext ctx) {
        return super.visitStart(ctx);
    }

    @Override
    public StmtNode visitStmt(SpoGrammarParser.StmtContext ctx) {
        System.out.println("Statements splitted: " + ctx.getText());
        // Detect assignments (don't know if i should look after ID or Assign)
        if(ctx.Assign() != null){
            System.out.println("Stmt: " + ctx.Assign());

            AssignmentNode assignment = new AssignmentNode();
            assignment.setId(ctx.ID().getText());
            assignment.setExpression(super.visitStmt(ctx));

            return assignment;
        } else if(ctx.Begin() != null){
            System.out.println(ctx.Begin().getText());
            BeginNode begin = new BeginNode();
            begin.setStmtNode(super.visitStmts(ctx.stmts()));
            return begin;
        }

        return super.visitStmt(ctx);
    }

    @Override
    public StmtNode visitStmts(SpoGrammarParser.StmtsContext ctx) {

        //Detect semicolon
        if(ctx.Semi() != null){
            System.out.println("Stmts: " + ctx.Semi());

            SemiNode semi = new SemiNode();
            semi.setLeft(super.visitStmts(ctx));

            //Somethings wrong with this line (double the amount of terminals)
            //semi.setRight(super.visitStmt(ctx.stmt()));

            return semi;
        }
        return super.visitStmts(ctx);
    }

    @Override
    public StmtNode visitE(SpoGrammarParser.EContext ctx) {

        //Detect plus
        if(ctx.Plus() != null){
            System.out.println("E: " + ctx.Plus());
            PlusNode plus = new PlusNode();
            plus.setLeft(super.visitE(ctx));
            plus.setRight(super.visitT(ctx.t()));
            return plus;
        }
        return super.visitE(ctx);
    }

    @Override
    public StmtNode visitT(SpoGrammarParser.TContext ctx) {
        //T is a number
        if(ctx.NUM() != null){
            NumNode node = new NumNode();
            node.setValue(Integer.parseInt(ctx.NUM().getText()));
            System.out.println("T NUM: " + node.getValue());
            return node;

        }
        //T is an ID
        else if(ctx.ID() != null){
            IDNode node = new IDNode();
            node.setValue(ctx.ID().getText());
            System.out.println("T ID: " + node.getValue());
            return node;
        }

        throw new IllegalArgumentException();
    }
}
