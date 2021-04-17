import algorithms.StringUtils;
import algorithms.search.BinarySearch;
import algorithms.search.LinearSearch;
import algorithms.search.Search;
import algorithms.search.TernanrySearch;
import algorithms.sort.LinearSort;
import algorithms.sort.LogSort;
import algorithms.sort.QuadraticSort;
import ds.linear.array.Array;
import ds.linear.linkedlist.LinkedList;
import ds.linear.queue.ArrayQueue;
import ds.linear.queue.LinkedListQueue;
import ds.linear.queue.PriorityQueue;
import ds.linear.queue.StackQueue;
import ds.linear.stack.Stack;
import ds.nonlinear.tree.binarysearchtree.BinarySearchTree;

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
        //testHashMap();
        //testBinarySearchTree();
        //testQuadraticSort();
        //testLogSort();
        //testLinearSort();
        //testSearch();
        testStringUtils();
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
        ds.linear.queue.Queue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);

        System.out.println(queue);
    }

    public static void testQueueWith2Stacks(){
        ds.linear.queue.Queue queue = new StackQueue();
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
        ds.linear.queue.Queue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        Stack stack = new Stack();
        ds.linear.queue.Queue tempQueue = new ArrayQueue();
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
        ds.linear.Hash.HashMap hashMap = new ds.linear.Hash.HashMap();
        hashMap.put(10, "Ten");
        hashMap.put(11, "Eleven");
        hashMap.put(1, "One");
        System.out.println(hashMap);
        hashMap.remove(11);
        System.out.println(hashMap);

    }

    public static void testBinarySearchTree(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.addNode(7);
        binarySearchTree.addNode(4);
        binarySearchTree.addNode(9);
        binarySearchTree.addNode(6);
        binarySearchTree.addNode(8);
        binarySearchTree.addNode(10);

        binarySearchTree.traverse(BinarySearchTree.TraverseType.PRE_ORDER);
        binarySearchTree.traverse(BinarySearchTree.TraverseType.POST_ORDER);
        binarySearchTree.traverse(BinarySearchTree.TraverseType.IN_ORDER);
        binarySearchTree.getHeight();
        binarySearchTree.getMin();
    }

    public static void testQuadraticSort(){
        Integer[] integer = new Integer[]{6, 3, 8, 2, 1, 1, 1, 1, 2, 2, 9, 4};
        QuadraticSort quadraticSort = new QuadraticSort();
        //sort.bubbleSort(integer);
        //System.out.println("BubbleSort : "+Arrays.toString(integer));

        //sort.selectionSort(integer);
        //System.out.println("Selection Sort : "+Arrays.toString(integer));

        quadraticSort.insertionSort(integer);
        System.out.println("Insertion Sort : "+Arrays.toString(integer));

    }

    public static void testLogSort(){
        int[] integer = new int[]{6, 3, 8, 2, 1, 1, 1, 1, 2, 2, 9, 4};
        LogSort logSort = new LogSort();

        //logSort.mergeSort(integer);
        //System.out.println("Merge Sort : "+Arrays.toString(integer));

        logSort.quickSort(integer);
        System.out.println("Quick Sort : "+Arrays.toString(integer));

    }

    public static void testLinearSort(){
        int[] integer = new int[]{6, 3, 8, 2, 1, 1, 1, 1, 2, 2, 9, 4};

//        LinearSort linearSort = new LinearSort();
//        linearSort.countingSort(integer);

        LinearSort linearSort = new LinearSort();
        linearSort.bucketSort(integer, 4);
    }

    public static void testSearch(){
        int[] integer = new int[]{6, 3, 8, 2, 1, 1, 1, 1, 2, 2, 9, 4};
        Search search = new LinearSearch();
        System.out.println(search.search(integer, 9));
        int[] sortedArray = new int[]{1,2,3,7,12,15,20,57};
//        search = new BinarySearch();
//        System.out.println(search.search(sortedArray, 33));
        search = new TernanrySearch();
        System.out.println(search.search(sortedArray, 15));

    }

    public static void testStringUtils(){
        String str = "heLLo WOrld I'm Mohamed";
        System.out.println(StringUtils.countVouls(str));
        System.out.println(StringUtils.reverse(str));
        System.out.println(StringUtils.reverseWords(str));
        System.out.println(StringUtils.areRotate("ABDC", "DaAB"));
        System.out.println(StringUtils.removeDuplicate("heLLo"));
        System.out.println(StringUtils.mostRepeatedCharWithArr("heLLoadklsjeiqjwdlenfekjnq"));
        System.out.println(StringUtils.capitalizeAll("hello WORld"));
        System.out.println(StringUtils.capitalizeFirst(" Hello"));
        System.out.println(StringUtils.isAnagram("abcd", "DACB"));
        System.out.println(StringUtils.isPalindrome("ABA"));
    }


}


    
