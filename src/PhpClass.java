import java.util.ArrayList;

public class PhpClass {
    ArrayList<Func> functions = new ArrayList<Func>();
    String name;
    String code;
    String description;

    @Override
    public String toString() {
        String str = "";
        str += this.name + "\n";
        str += this.description + "\n";
        str += this.code + "\n";
        for (Func f : this.functions){
            str+= f.toString();
        }
        return str;
    }
}
