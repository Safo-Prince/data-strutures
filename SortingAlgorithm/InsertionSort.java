package SortingAlgorithm;

public class InsertionSort {
    public void sort(int [] array){

        for(var i = 0 ; i < array.length; i++){
            var current = array[i];
            var j = i - 1;
            while (j >= 0 && array[j]  > current){
                array[j + 1] = array[j];
                j--;
            }// after this while loop all the greater  items should have been shifted to the right.
            array[j+ 1] = current;
        }


    }
}
