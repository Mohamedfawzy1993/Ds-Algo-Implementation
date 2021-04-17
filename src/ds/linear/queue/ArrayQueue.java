package ds.linear.queue;

import java.util.Arrays;

/**
 * The Class ArrayQueue
 *
 * @author mohamed.fawzy
 */
public class ArrayQueue implements Queue {

    final int size = 5;
    Object[] objects = new Object[size];
    int first = 0 ;
    int last = 0;
    int count = 0;

    @Override
    public void enqueue(Object o) {
        if(count == objects.length){
            throw new IllegalArgumentException();
        }
        this.objects[last] = o;
        last = (last+1) % size;
        count++;
    }

    @Override
    public Object dequeue() {
        Object o = objects[first];
        objects[first] = null;
        first = (first+1) % size;
        count--;
        return o;
    }

    @Override
    public Boolean isEmpty() {
        return first == last;
    }

    @Override
    public Boolean isFull() {
        return null;
    }

    @Override
    public Object peek() {
       return this.objects[first];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.objects);
    }


}

    
