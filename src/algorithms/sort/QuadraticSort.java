package algorithms.sort;

import java.util.Arrays;

/**
 * The Class BubbleSort
 *
 * @author mohamed.fawzy
 */
public class QuadraticSort {
    public QuadraticSort() { }

    //O(n^2)
    public void bubbleSort(Integer [] numbers) {
        int swapsCount;
        do {
            swapsCount = 0;
            for(int i = 0 ; i<numbers.length-1; i++){
                if(numbers[i] > numbers[i+1]){
                    swap(numbers, i, i+1);
                    swapsCount++;
                }
            }
        } while (swapsCount > 0);
    }

    //O(n^2)
    public void selectionSort(Integer[] numbers){
        for(int i = 0 ; i< numbers.length; i++){
            Integer indexToSwap = findSmallingIndex(numbers, i);
            if(indexToSwap == i)
                continue;
            else
                swap(numbers, indexToSwap, i);
        }
    }

    //O(n^2)
    public void insertionSort(Integer[] numbers){
        for(int i = 1 ; i < numbers.length; i++){
            int current = numbers[i];
            int j = i-1;
            while (j >= 0 && numbers[j] > current){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = current;
        }
    }



    private void swap(Integer[] numbers, Integer index, Integer secondIndex){
        Integer swapTemp = -1;
        swapTemp = numbers[index];
        numbers[index] = numbers[secondIndex];
        numbers[secondIndex] = swapTemp;
    }

    private Integer findSmallingIndex(Integer[] array, int startingIndex){
        Integer temp = array[startingIndex];
        int index = startingIndex;
        for(int i = startingIndex ; i < array.length; i++){
            if(array[i] < temp) {
                temp = array[i];
                index = i;
            }
        }
        return index;
    }
}

    
