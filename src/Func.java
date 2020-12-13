import java.util.ArrayList;

public class Func {
    public String signature;
    public String description;
    public String code;

    @Override
    public String toString() {
        String str = "";
        str += this.description+"\n";
        str += this.signature+"\n";
        str += this.code+"\n";
        return str;
    }
}
