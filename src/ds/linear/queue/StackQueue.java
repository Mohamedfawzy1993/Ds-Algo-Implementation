package ds.linear.queue;

import ds.linear.stack.Stack;

/**
 * The Class StackQueue
 *
 * @author mohamed.fawzy
 */
public class StackQueue implements Queue {

    Stack enqueueStack = new Stack();
    Stack dequeueStack = new Stack();

    //O(1)
    @Override
    public void enqueue(Object o) {
        enqueueStack.push(o);
    }

    //O(n)
    @Override
    public Object dequeue() {
        if(isEmpty())
            throw new IllegalStateException();
        enrichDeQueueStack();
        return dequeueStack.pop();
    }

    @Override
    public Boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    @Override
    public Boolean isFull() {
        return null;
    }

    @Override
    public Object peek() {
        enrichDeQueueStack();
        return dequeueStack.peek();
    }

    @Override
    public String toString() {
       enrichDeQueueStack();
       return this.dequeueStack.toString();
    }

    //O(n)
    private void enrichDeQueueStack(){
        while(!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
    }
}

    
