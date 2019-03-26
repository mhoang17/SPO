public class NodeClasses {
}
class StmtNode{ }

class NumNode extends StmtNode {
    private int value;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }
}

class IDNode extends StmtNode{
    private String value;

    String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }
}

class AssignmentNode extends StmtNode{
    private String id;
    private StmtNode expression;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StmtNode getExpression() {
        return expression;
    }

    public void setExpression(StmtNode expression) {
        this.expression = expression;
    }
}

class SemiNode extends StmtNode{
    private StmtNode left;
    private StmtNode right;

    public StmtNode getLeft() {
        return left;
    }

    public void setLeft(StmtNode left) {
        this.left = left;
    }

    public StmtNode getRight() {
        return right;
    }

    public void setRight(StmtNode right) {
        this.right = right;
    }
}

class PlusNode extends StmtNode {
    private StmtNode left;
    private StmtNode right;

    public StmtNode getLeft() {
        return left;
    }

    public void setLeft(StmtNode left) {
        this.left = left;
    }

    public StmtNode getRight() {
        return right;
    }

    public void setRight(StmtNode right) {
        this.right = right;
    }
}

class BlockNode extends StmtNode{

    private StmtNode stmtNode;

    public StmtNode getStmtNode() {
        return stmtNode;
    }

    public void setStmtNode(StmtNode stmtNode) {
        this.stmtNode = stmtNode;
    }
}
