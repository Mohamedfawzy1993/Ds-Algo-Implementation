import ds.Array;

import java.util.ArrayList;

import static java.lang.System.*;

/**
 * The Class Main
 *
 * @author mohamed.fawzy
 */
public class Main {
    public static void main(String[] args) {
      testArrayImpl();
    }

    public static void testArrayImpl() {
        Array array = new Array(2);
        array.insert(1);
        array.insert(4);
        array.insert(0);
        array.insert(40);
//        array.reverse();
        array.insertAt("Hello", 100);
        array.print();
    }

}

//ArrayList Grow by 50% - Not Sync
//Vector Grow by 100% - Sync

    
