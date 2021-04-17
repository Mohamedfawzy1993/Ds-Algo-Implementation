package algorithms.search;

/**
 * The Class LinearSearch
 *
 * @author mohamed.fawzy
 */
public class LinearSearch implements Search {

    @Override
    public Integer search(int[] array, int val) {
        for(int i = 0 ; i<array.length; i++){
            if(array[i] == val)
                return  i;
        }
        return -1;
    }
}

    
