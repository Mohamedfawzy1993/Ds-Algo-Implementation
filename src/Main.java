import ds.Array;
import static java.lang.System.*;

/**
 * The Class Main
 *
 * @author mohamed.fawzy
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array(2);
        array.insert("Hello");
        array.insert("Hello1");
        array.insert("Hello2");
        array.insert("Hello3");
        array.deleteAt(99);
        out.println(array.indexOf("Hello3"));
        array.print();

    }
}

    
