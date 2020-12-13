import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhpClass {
    String className;
    String description;
    ArrayList<String> attrs =new ArrayList<String>();
    ArrayList<Func> methods = new ArrayList<Func>();

//    @Override
//    public String toString() {
//        String str = "";
//        str += this.name + "\n";
//        str += this.description + "\n";
//        str += this.code + "\n";
//        for (Func f : this.functions){
//            str+= f.toString();
//        }
//        return str;
//    }
}
