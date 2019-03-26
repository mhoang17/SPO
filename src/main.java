import gen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException{

        //Read file as stream of chars
        CharStream stream = CharStreams.fromFileName("temp.txt");

        //Use lexer, find tokens and make the parser
        SpoGrammarLexer lexer = new SpoGrammarLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpoGrammarParser parser = new SpoGrammarParser(tokenStream);

        //Make the parse tree for traversal (start from root (start: first grammar rule)
        ParseTree tree = parser.start();

        // Traverse, I think
        ASTVisitor visitor = new ASTVisitor();
        visitor.visit(tree);
    }
}
