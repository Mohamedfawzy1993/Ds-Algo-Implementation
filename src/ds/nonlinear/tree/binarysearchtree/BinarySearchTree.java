package ds.nonlinear.tree.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class BinarySearchTree
 *
 * @author mohamed.fawzy
 */
public class BinarySearchTree {
    Node head;
    public enum TraverseType {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }

    //O(log n)
    public void addNode(Integer number){
        if(head == null) {
            head = new Node(number);
        } else {
            Node cursor = head;
            Node temp = head;

           while (cursor != null){
               temp = cursor;
               if(cursor.value > number)
                   cursor = cursor.left;
               else if(cursor.value < number)
                   cursor = cursor.right;
           }

            Node val = new Node(number);

            if(temp.value > val.value)
                temp.left = val;
            else
                temp.right = val;
        }
    }

    //O(log n)
    public boolean find(int value){
        Node cursor = head;
        while (cursor != null){
            if(cursor.value.equals(value))
                return true;
            else if(cursor.value >  value){
                cursor = cursor.left;
            } else if(cursor.value < value)
                cursor = cursor.right;
        }
        return false;
    }

    //O(n)
    public void traverse(TraverseType traverseType){
        List<Integer> traverseResult = new ArrayList<>();
        if(traverseType == TraverseType.PRE_ORDER){
            preOrderTraverse(traverseResult, head);
            System.out.println(traverseResult);
        } else if(traverseType == TraverseType.POST_ORDER){
            postOrderTraverse(traverseResult, head);
            System.out.println(traverseResult);
        } else {
            InOrderTraverse(traverseResult, head);
            System.out.println(traverseResult);
        }
    }

    public void getHeight() {

        System.out.println(height(head));
    }

    private int height(Node head){
        // 1 + Max(Height(left), Height(right))
        // Post Order Traverser
        if(head == null)
            return -1;
        if(head.left == null && head.right == null)
            return 0;
        return 1 + Math.max(height(head.left), height(head.right));

    }

    private void preOrderTraverse(List<Integer> traverseResult, Node cursor) {
        if(cursor == null)
            return;
        traverseResult.add(cursor.value);
        preOrderTraverse(traverseResult, cursor.left);
        preOrderTraverse(traverseResult, cursor.right);
    }

    private void postOrderTraverse(List<Integer> traverseResult, Node cursor) {
        if(cursor == null)
            return;
        postOrderTraverse(traverseResult, cursor.left);
        postOrderTraverse(traverseResult, cursor.right);
        traverseResult.add(cursor.value);
    }

    private void InOrderTraverse(List<Integer> traverseResult, Node cursor) {
        if(cursor == null)
            return;
        InOrderTraverse(traverseResult, cursor.left);
        traverseResult.add(cursor.value);
        InOrderTraverse(traverseResult, cursor.right);
    }

    //O(n)
    private int minOfBinaryTree(Node head){
        if(head.right == null && head.left == null)
            return head.value;

        int left = minOfBinaryTree(head.left);
        int right = minOfBinaryTree(head.right);
        return Math.min(Math.min(left, right), head.value);
    }

    //O(log n)
    private int minOfBinarySearchTree(Node head){
        if(head == null)
            throw new IllegalStateException();
        if(head.left == null)
            return head.value;
        return minOfBinarySearchTree(head.left);
    }

    public void getMin(){
        System.out.println(minOfBinarySearchTree(head));
    }

}


// Depth First
// Pre-order root,Left,right
// In-order left,root,right "Ascending Order"
// Post-order left,right,root

//Depth Count from top to down start with Zero
//Height Count from down to top start with Zero


    
