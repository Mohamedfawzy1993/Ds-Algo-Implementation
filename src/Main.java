import ds.Array;
import ds.linkedlist.LinkedList;
import ds.stack.BalanceString;

import java.util.Arrays;


/**
 * The Class Main
 *
 * @author mohamed.fawzy
 */
public class Main {
    public static void main(String[] args) {
        //testArrayImpl();
        //testLinkedListImpl();
        System.out.println(new BalanceString().isBalanced("((<1>+<2>))[a]"));
    }

    public static void testArrayImpl() {
        Array array = new Array(2);
        array.insert(1);
        array.insert(4);
        array.insert(0);
        array.insert(40);
        array.reverse();
        array.insertAt("Hello", 100);
        array.print();
    }

    public static void testLinkedListImpl(){
        LinkedList linkedList = new LinkedList();
        linkedList.addLast("Hello");
        linkedList.addLast("Hello1");
        linkedList.addLast("Hello2");
        linkedList.addLast("Hello3");
        linkedList.addLast("Hello Final");
        linkedList.reverse();
        Object[] arr = linkedList.toArray();
        System.out.println(Arrays.toString(arr));
        linkedList.print();
        System.out.println(linkedList.findKthFromLast(4));
    }

}


    
