package ds.queue;

public interface Queue {

    void enqueue(Object o);
    Object dequeue();
    Boolean isEmpty();
    Boolean isFull();
    Object peek();

}
