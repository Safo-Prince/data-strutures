import SortingAlgorithm.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

     @Test
     public void SortNumbers(){
         int [ ] numbers = {3,4,5,6,7,3};
         int [ ] expected =  {3, 3, 4, 5, 6, 7};
         var sorter = new InsertionSort();
         sorter.sort(numbers);
         Assert.assertArrayEquals(expected,numbers);



     }

}