import com.google.gson.Gson;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.Hashtable;


public class PhpDoc extends PhpParserBaseListener {

    private Hashtable<String, PhpClass> classTable = new Hashtable<>();

    public static int findExpr(String expr, String str){
        int expLen = expr.length();
        int expHash = expr.hashCode();
        for (int i=0;i<=str.length()-expLen;i++){
            String current = str.substring(i,i+expLen);
            if (current.hashCode() == expHash) {
                return i;
            }
        }
        return -1;
    }
    public String deleteComment(String str){
        while(PhpDoc.findExpr("/*", str)!=-1){
            int i = PhpDoc.findExpr("/*",str);
            int j = PhpDoc.findExpr("*/",str);
            if (i>0) {
                str = str.substring(0, i - 1) + str.substring(j + 2, str.length());
            }else{
                str = str.substring(j + 2, str.length());
            }
        }
        return str;
    }
    @Override
    public void enterToDoc(PhpParser.ToDocContext ctx) {

        PhpClass cls = new PhpClass();
        cls.className = ctx.classDeclaration().identifier().getText();
        cls.description = ctx.Decorator().getText();
        cls.description = cls.description.substring(14,cls.description.length()-2).strip();
        this.classTable.put(cls.className,cls);
        for (PhpParser.ClassStatementContext classSt : ctx.classDeclaration().classStatement()){
            try{
                if (classSt.funcToDoc()!=null){
                    Func func = new Func();
                    func.description = classSt.funcToDoc().Decorator().getText();
                    func.description = func.description.substring(14,func.description.length()-2).strip();
                    int a = classSt.start.getStartIndex();
                    int b = classSt.stop.getStopIndex();
                    Interval interval = new Interval(a,b);
                    func.code = classSt.start.getInputStream().getText(interval);
                    func.code = this.deleteComment(func.code);
                    func.signature = ctx.start.getInputStream().getText(interval);
                    func.signature = this.deleteComment(func.signature);
                    int end = PhpDoc.findExpr("{",func.signature);
                    func.signature = func.signature.substring(0,end-1);
                    cls.methods.add(func);
                }else{
                    if(classSt.Function()==null){
                        int a = classSt.start.getStartIndex();
                        int b = classSt.stop.getStopIndex();
                        Interval interval = new Interval(a,b);
                        cls.attrs.add( classSt.start.getInputStream().getText(interval).strip().replace(";",""));
                    }
                }
            }
            catch (Exception e){
                //System.out.println(e);
            }
        }
    }

    @Override
    public void enterFuncToDoc(PhpParser.FuncToDocContext ctx) {
//        super.enterFuncToDoc(ctx);
//        Func func = new Func();
//        func.description = ctx.Decorator().getText();
//        int a = ctx.start.getStartIndex();
//        int b = ctx.stop.getStopIndex();
//        Interval interval = new Interval(a,b);
//        func.signature = ctx.start.getInputStream().getText(interval);
//        func.signature = this.deleteComment(func.signature);
//        int end = PhpDoc.findExpr("{",func.signature);
//        func.signature = func.signature.substring(0,end-1);
//        System.out.println(func.signature);
    }

    public String getString(){
        return "W";
    }

    @Override
    public void exitHtmlElementOrPhpBlock(PhpParser.HtmlElementOrPhpBlockContext ctx) {
        Gson gson = new Gson();
        ArrayList<PhpClass> str = new ArrayList<PhpClass>();
        for (PhpClass c : this.classTable.values()){
            str.add(c);
        }
        String aux = gson.toJson(str).toString();
        System.out.println(aux);
    }
}
