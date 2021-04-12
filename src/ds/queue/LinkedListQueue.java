package ds.queue;

import ds.linkedlist.LinkedList;

import java.util.Arrays;

/**
 * The Class LinkedListQueue
 *
 * @author mohamed.fawzy
 */
public class LinkedListQueue implements Queue {

    LinkedList linkedList = new LinkedList();

    @Override
    public void enqueue(Object o) {
        linkedList.addLast(o);
    }

    @Override
    public Object dequeue() {
        Object first = linkedList.get(0);
        linkedList.deleteFirst();
        return first;
    }

    @Override
    public Boolean isEmpty() {
        return linkedList.size() == 0;
    }

    @Override
    public Boolean isFull() {
        return null;
    }

    @Override
    public Object peek() {
        return linkedList.get(0);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.linkedList.toArray());
    }
}

    
