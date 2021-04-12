import ds.array.Array;
import ds.linkedlist.LinkedList;
import ds.queue.ArrayQueue;
import ds.queue.LinkedListQueue;
import ds.queue.PriorityQueue;
import ds.queue.StackQueue;
import ds.stack.BalanceString;
import ds.stack.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;


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
        //testQueueWith2Stacks();
        //testPrioQueue();
        //reverseKthIndexOfQueue(3);
        //testLinkedListQueue();
        //testJavaHashMap();
        //testJavaSet();
        testHashMap();
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
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    public static void testPrioQueue(){
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enqueue(4);
        priorityQueue.enqueue(92);


        priorityQueue.enqueue(9);

        priorityQueue.enqueue(92);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(1);
        priorityQueue.enqueue(1);
        System.out.println(priorityQueue);


    }

    public static void reverseKthIndexOfQueue(int k){
        ds.queue.Queue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        Stack stack = new Stack();
        ds.queue.Queue tempQueue = new ArrayQueue();
        for(int i = 0 ; i < k; i++){
            stack.push(queue.dequeue());
        }

        while(!stack.isEmpty())
            tempQueue.enqueue(stack.pop());
        while (!queue.isEmpty())
            tempQueue.enqueue(queue.dequeue());
        queue = tempQueue;
        System.out.println(queue);

    }

    public static void testLinkedListQueue(){
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(120);
        linkedListQueue.enqueue(130);
        linkedListQueue.enqueue(140);
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());
    }

    public static void testJavaHashMap() {
        //Allow null "Key or Value"
        String str = "a green apple";
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            characterIntegerHashMap.put(ch, characterIntegerHashMap.get(ch) == null ? 1 : characterIntegerHashMap.get(ch)+1);
        }
        for(char ch : characterIntegerHashMap.keySet()){
            if(characterIntegerHashMap.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }

    public static void testJavaSet(){
        Set<Integer> integerSet = new HashSet<>();
        int[] numbers = {1, 2, 1, 3, 1, 2, 2, 5};
        for(int number : numbers)
            integerSet.add(number);
        System.out.println(integerSet);
    }

    public static void testHashMap(){
        ds.Hash.HashMap hashMap = new ds.Hash.HashMap();
        hashMap.put(10, "Ten");
        hashMap.put(11, "Eleven");
        hashMap.put(1, "One");
        System.out.println(hashMap);
        hashMap.remove(11);
        System.out.println(hashMap);

    }



}


    
