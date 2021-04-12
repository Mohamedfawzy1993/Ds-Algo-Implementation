import ds.array.Array;
import ds.linkedlist.LinkedList;
import ds.queue.ArrayQueue;
import ds.queue.StackQueue;
import ds.stack.BalanceString;
import ds.stack.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;


/**
 * The Class Main
 *
 * @author mohamed.fawzy
 */
public class Main {
    public static void main(String[] args) {
        //testArrayImpl();
        //testLinkedListImpl();
        //System.out.println(new BalanceString().isBalanced("((<1>+<2>))[a]"));
        //testStackImpl();
        //testQueueReverse();
        testQueueWith2Stacks();


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

    public static void testStackImpl(){
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public static void testQueueReverse(){
        Queue<Integer> integers = new ArrayDeque<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);

        Stack integerStack = new Stack();
        while(!integers.isEmpty())
            integerStack.push(integers.remove());
        while (!integerStack.isEmpty())
            integers.add((Integer)integerStack.pop());
        System.out.println(integers);

    }

    public static void testArrayQueue(){
        ds.queue.Queue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);

        System.out.println(queue);
    }

    public static void testQueueWith2Stacks(){
        ds.queue.Queue queue = new StackQueue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);

//        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }



}


    
