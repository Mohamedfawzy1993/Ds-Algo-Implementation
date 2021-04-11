package ds.stack;

/**
 * The Class Stack
 *
 * @author mohamed.fawzy
 */
public class Stack {
    Object [] stack;
    int length = 0;
    public Stack() {
        stack = new Object[2];
    }

    public void push(Object o) {
        if(length >= stack.length) {
            Object [] tempStack = new Object[stack.length*2];
            for(int i = 0 ; i<length ; i++){
                tempStack[i] = stack[i];
            }
            stack = tempStack;
        }
        stack[length] = o;
        length++;
    }

    public Object pop() {

        Object val =  stack[--length];
        return val;

    }

    public Object peek(){
        return stack[length-1];
    }

    public Boolean isEmpty(){
        return length == 0;
    }


}

    
