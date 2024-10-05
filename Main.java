import SortingAlgorithm.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String [] args){
        int [ ] numbers = {3,4,5,6,7,3};
                var sorter = new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
