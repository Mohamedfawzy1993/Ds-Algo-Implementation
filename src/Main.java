import ds.Array;
import ds.linkedlist.LinkedList;

import java.util.Arrays;


/**
 * The Class Main
 *
 * @author mohamed.fawzy
 */
public class Main {
    public static void main(String[] args) {
//      testArrayImpl();
        testLinkedListImpl();
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
//        linkedList.insert("Hello");
//        linkedList.insert("Hello1");
//        linkedList.insert("Hello2");
//        linkedList.insert("Hello3");
//        linkedList.insert("Hellox");
        linkedList.addLast("Hello");
        linkedList.addLast("Hello1");
        linkedList.addLast("Hello2");
        linkedList.addLast("Hello3");
        linkedList.deleteLast();
        linkedList.deleteFirst();
        linkedList.addLast("Hello Final");
        System.out.println(linkedList.size());
        Object[] arr = linkedList.toArray();
        System.out.println(Arrays.toString(arr));
//        linkedList.print();
    }

}


    
