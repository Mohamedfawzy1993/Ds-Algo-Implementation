package ds.array;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static java.lang.System.*;

/**
 * The Class Array
 *
 * @author mohamed.fawzy
 */
public class Array {

    Object [] objectList;
    private int length = 0;

    public Array(int length) {
        objectList = new Object[length];
    }

    public void insert(Object o){
        checkAndExtend();
        objectList[length++] = o;
    }

    public void insertAt(Object o, int index){
        if(objectList.length < index){
            checkAndExtend(index+1);
        }
        if(index >= length)
            objectList[index] = o;
        else
            for(int i = length; i > index; i--)
                objectList[i] = objectList[i-1];
        length++;
    }

    public void deleteAt(int index){
        if(index < 0 || index >= length)
            return;
        else if(index != (length-1)) {
            for(int i = index ; i < length-1 ; i++){
                objectList[i] = objectList[i+1];
            }

        }
        else{
            objectList[index] = null;
        }
        length--;
    }

    public Object get(int index){
        return objectList[index];
    }

    public int indexOf(Object o){
        for(int i = 0; i <length; i++){
            if(objectList[i] == o)
                return i;
        }
        return -1;
    }

    public int size() {
        return length;
    }

    public void print(){
        for(int i = 0 ; i < objectList.length ; i++){
            if(objectList[i] != null)
                out.println(objectList[i]);
        }
    }

    public Integer max() {
        if(objectList[0] != null && objectList[0] instanceof Integer){
            int max = (int)objectList[0];
            for(int i = 0 ; i< length ; i++){
                if((int)objectList[i] > max)
                    max = (int)objectList[i];
            }
            return max;
        }
        throw new NotImplementedException();
    }

    public void reverse() {
        Object[] reverseArray = new Object[objectList.length];
        for(int i = 0 ; i < length; i++){
            reverseArray[i] = objectList[length-i-1];
        }
        objectList = reverseArray;
    }

    private void checkAndExtend(){
        if(objectList.length == length){
            Object[] newArray = new Object[objectList.length*2];
            for(int i = 0 ; i < length ; i++)
                newArray[i] = objectList[i];
            objectList = newArray;
        }
    }

    private void checkAndExtend(int extendLength){
        Object[] newArray;
        if(objectList.length < extendLength){
            if(objectList.length * 2 < extendLength)
                newArray = new Object[extendLength];
            else {
               newArray = new Object[objectList.length*2];
            }
            for(int i = 0 ; i < length ; i++)
                newArray[i] = objectList[i];
            objectList = newArray;
        }
    }
}

    
//Insert -> O(n)
//Fetch -> O(1)
//Delete -> O(n)
//ArrayList Grow by 50% - Not Sync
//Vector Grow by 100% - Sync
