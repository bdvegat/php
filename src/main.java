import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        PhpLexer lexer = new PhpLexer(CharStreams.fromFileName("input.txt"));
        //PhpLexer lexer = new PhpLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PhpParser parser = new PhpParser(tokens);
        PhpDoc p = new PhpDoc();
        ParseTree tree = parser.htmlElementOrPhpBlock();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PhpDoc(), tree);
    }
}
