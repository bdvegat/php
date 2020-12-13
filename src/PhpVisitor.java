public class PhpVisitor extends PhpParserBaseVisitor{
    String str = "";
    String desc = "";
    int functionId = 0;
    @Override
    public Object visitToDoc(PhpParser.ToDocContext ctx) {
        //System.out.println(ctx.classDeclaration());
        desc += ctx.Decorator();
        visitClassDeclaration(ctx.classDeclaration());
        return ctx;
    }

    @Override
    public Object visitClassDeclaration(PhpParser.ClassDeclarationContext ctx) {

        ctx.attributes();
        for (int i=0; i<ctx.classStatement().size() ;i++){
            visitClassStatement(ctx.classStatement(0));
        }
        ctx.classEntryType();
        ctx.CloseCurlyBracket();
        System.out.println(str);
        System.out.println(desc);
        return ctx;
    }

    @Override
    public Object visitClassStatement(PhpParser.ClassStatementContext ctx) {
        if (ctx.identifier().getText().equals("")){
            System.out.println("sfd");
        }
        System.out.println(ctx.identifier().getText()+" jhjkjg");
        System.out.println("dfdsdfdf");
        return ctx;
    }
}
