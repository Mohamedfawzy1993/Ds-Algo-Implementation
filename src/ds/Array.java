package ds;

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
        if(objectList.length == length){
            Object[] newArray = new Object[objectList.length*2];
            for(int i = 0 ; i < length ; i++)
                newArray[i] = objectList[i];

            objectList = newArray;
        }
        objectList[length++] = o;
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
        for(int i = 0 ; i < length ; i++){
            out.println(objectList[i]);
        }
    }


}

    
