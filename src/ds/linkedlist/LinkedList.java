package ds.linkedlist;

import static java.lang.System.*;

/**
 * The Class LinkedList
 *
 * @author mohamed.fawzy
 */
public class LinkedList {

    private Node first;
    private Node last;
    private int length;

    public LinkedList() {
    }

    public void addFirst(Object o){
        Node node = new Node();
        node.next = first;
        node.value = o;
        first = node;
        length++;
    }

    public void addLast(Object o){


        Node node = new Node();
        node.value = o;
        if(length > 0) {
            last.next = node;
        } else {
            first = node;
        }
        last = node;
        length++;
    }

    public void deleteFirst() {
        first = first.next;
        length--;
    }

    public void deleteLast() {
        Node temp = first;
        while(true){
            if(temp.next == last){
                temp.next = null;
                last = temp;
                break;
            } else {
                temp = temp.next;
            }
        }
        length--;
    }

    public boolean contains(Object o){
        Node temp = first;
        while(temp.next != null){
            if(temp.value == o)
                return true;
            else
                temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object o) {
        Node temp = first;
        int iter = 0 ;
        while(temp.next != null){
            if(temp.value == o)
                break;
            else
                temp = temp.next;
            iter++;
        }
        return iter;
    }

    public void insert(Object o) {
        if (first.value == null) {
            first.value = o;
        } else if (last.value == null) {
            last.value = o;
        } else {
            Node node = new Node();
            node.value = o;
            last.next = node;
            last = node;
        }
    }

    public void print(){
        Node temp = first;
        while (temp != null){
            out.println(temp.value);
            temp = temp.next;
        }
    }

    public int size(){
        return length;
    }

    public Object[] toArray(){
        Object[] arr = new Object[size()] ;
        Node temp = first;
        int i = 0;
        while(temp != null){
            arr[i++] = temp.value;
            temp = temp.next;
        }
        return arr;
    }

    public void reverse() {
        if(length == 0)
            return;
        //         p ->   c  -> n
        //        [10 -> 20 -> 30]
        Node current = first.next;
        Node previous = first;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        //Assigning First to last
        last = first;
        last.next = null;
        //Assiging First to Previous
        first = previous;
    }

    public Object findKthFromLast(int k) {
        if(k >= length)
            throw new IllegalArgumentException();
        int distance = k;
        Node first = this.first;
        Node second;
        do{
           second = first;
           for(int i = 0 ; i < distance ; i++){
               second = second.next;
           }
           if(second.next == null)
               return first.value;
           else
               first = first.next;
        } while (true);

    }
}


//Insert O(1)
//Delete O(n)
//Fetching O(n)
