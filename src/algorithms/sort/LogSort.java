package algorithms.sort;

/**
 * The Class LogSort
 *
 * @author mohamed.fawzy
 */
public class LogSort {

    //O(n log n)
    public void mergeSort(int[] array) {

        //Max Division
        if (array.length < 2)
            return;

        //Divide
        int middle = array.length / 2;
        int[] left = new int[middle];
        System.arraycopy(array, 0, left, 0, middle);

        int[] right = new int[array.length - middle];
        if (array.length - middle >= 0) System.arraycopy(array, middle, right, 0, array.length - middle);

        //Sort
        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = result[j++];
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public void quickSort(int [] array){
        quickSort(array, 0, array.length);
    }
    private void quickSort(int[] array, int start , int end) {

        if(start >= end)
            return;
        //Partition
        int boundary = partition(array, start, end);
        //Sort left
        quickSort(array,start, boundary   );
        quickSort(array,boundary+1, end);
    }

    private int partition(int[] array, int start , int end) {
        int pivot = array[end];
        int boundry = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot)
                swap(array, i, ++boundry);
        }
        return boundry;
    }

    private void swap(int[] numbers, Integer index, Integer secondIndex) {
        Integer swapTemp = -1;
        swapTemp = numbers[index];
        numbers[index] = numbers[secondIndex];
        numbers[secondIndex] = swapTemp;
    }


}

    
