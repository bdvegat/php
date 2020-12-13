import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;


public class PhpDoc extends PhpParserBaseListener {

    private String className;
    private ArrayList<Params> params;
    private ArrayList<Func> functions;
    private String description;
    public boolean findExpr(String expr, String str){
        int expLen = expr.length();
        int expHash = expr.hashCode();
        for (int i=0;i<=str.length()-expLen;i++){
            String current = str.substring(i,i+expLen);
            if (current.hashCode() == expHash) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void enterToDoc(PhpParser.ToDocContext ctx) {
        this.description=ctx.Decorator().getText().substring(12,ctx.Decorator().getText().length()-2);
        this.className = ctx.classDeclaration().identifier().getText();
        int a = ctx.classDeclaration().start.getStartIndex();
        int b = ctx.classDeclaration().stop.getStopIndex();
        Interval interval = new Interval(a,b);
        String viewSql = ctx.start.getInputStream().getText(interval);
        System.out.println(viewSql);

        for (PhpParser.ClassStatementContext classSt : ctx.classDeclaration().classStatement()){
            try{
                a = classSt.start.getStartIndex();
                b = classSt.stop.getStopIndex();
                interval = new Interval(a,b);
                viewSql = ctx.start.getInputStream().getText(interval);
                System.out.println(viewSql);
                //System.out.println(classSt.typeParameterListInBrackets().getText());
                System.out.println("_____________________________________________________");
            }
            catch (Exception e){

            }
        }
        System.out.println(this.description);
    }

    public String getString(){
        return "W";
    }
}
