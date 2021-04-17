package ds.linear.queue;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

/**
 * The Class PriorityQueue
 *
 * @author mohamed.fawzy
 */
public class PriorityQueue implements Queue {

    int[] queue = new int[2];
    int count = 0;
    int first = 0;
    @Override
    public void enqueue(Object o) {
        if(count == queue.length){
            expandArray();
        }
        Integer input = (Integer) o;
        queue[shiftItems(input)] = input;
        count++;
    }



    @Override
    public Object dequeue() {
        return this.queue[first++];
    }

    @Override
    public Boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Boolean isFull() {
        throw new NotImplementedException();
    }

    @Override
    public Object peek() {
        return this.queue[first];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.queue);
    }

    private void expandArray(){
        int[] objects = new int[this.queue.length*2];
        int internalIncrement = 0 ;
        for(int i = first ; i< this.queue.length; i++){
            objects[internalIncrement] = this.queue[i];
            internalIncrement++;
        }
        this.queue = objects;
        this.first = 0;
    }

    private int shiftItems(int input){
        int index;
        for (index = count - 1; index >= 0; index--) {
            if (queue[index] > input) {
                queue[index + 1] = queue[index];
            } else {
                break;
            }
        }
        return index+1;
    }
}

    
