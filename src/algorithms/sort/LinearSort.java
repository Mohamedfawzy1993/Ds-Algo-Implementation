package algorithms.sort;

import ds.linear.array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The Class LinearSort
 *
 * @author mohamed.fawzy
 */
public class LinearSort {

    public void countingSort(int[] array) {
        int [] arr = new int[getMaxOfArray(array)+1];
        for (int val : array) {
            arr[val] = arr[val]+1;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int x = 0 ; x < arr[i]; x++){
                array[index++] = i;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void bucketSort(int[] array, int noOfbuckets){
        List<List<Integer>> buckets = new ArrayList<>(noOfbuckets);
        for(int i = 0 ; i<noOfbuckets; i++ ){
            buckets.add(new ArrayList<>());
        }
        for(int val : array){
            buckets.get(val/noOfbuckets).add(val);
        }
        int k = 0;
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
            for (Integer val : bucket){
                array[k++] = val;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public int getMaxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }
}

    
