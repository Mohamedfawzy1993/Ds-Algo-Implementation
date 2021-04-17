package algorithms.search;

/**
 * The Class BinarySearch
 *
 * @author mohamed.fawzy
 */
public class BinarySearch implements Search {

    @Override
    public Integer search(int[] array, int val) {
//        return searchRec(array, val, 0, array.length - 1);
        return search(array, val, 0 , array.length-1);
    }

    private int searchRec(int[] array, int val, int start, int end) {
        if (end < start)
            return -1;
        int middle = (start + end) / 2;
        if (array[middle] == val)
            return middle;
        if (val < array[middle]) {
            return search(array, val, start, middle-1);
        }
        return search(array, val, middle+1, end);
    }

    private int search(int [] array, int val, int start, int end){
        int middle;
        while (start <= end){
            middle = (start+end)/2;
            if(array[middle] == val)
                return middle;
            if(val < array[middle])
                end = middle-1;
            if(val > array[middle])
                start = middle+1;
        }
        return -1;
    }
}

    
