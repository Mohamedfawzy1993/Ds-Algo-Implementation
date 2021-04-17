package algorithms.search;

/**
 * The Class BinarySearch
 *
 * @author mohamed.fawzy
 */
public class TernanrySearch implements Search {

    @Override
    public Integer search(int[] array, int val) {
        return searchRec(array, val, 0, array.length - 1);
    }

    private int searchRec(int[] array, int val, int start, int end) {
        if (end < start)
            return -1;
        int partition = (start + end) / 3;
        int mid1 = start + partition;
        int mid2 = end - partition;


        if (array[mid1] == val)
            return mid1;
        if (array[mid2] == val)
            return mid2;
        if (val < array[mid1])
            return search(array, val, start, mid1 - 1);
        if (val > array[mid2])
            return search(array, val, mid2+1, end);
        else return search(array, val, mid1+1, mid2-1);

    }

    private int search(int[] array, int val, int start, int end) {
        int middle;
        while (start <= end) {
            middle = (start + end) / 2;
            if (array[middle] == val)
                return middle;
            if (val < array[middle])
                end = middle - 1;
            if (val > array[middle])
                start = middle + 1;
        }
        return -1;
    }
}

    
