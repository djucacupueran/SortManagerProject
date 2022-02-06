import com.spartaglobal.model.BubbleSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleTest {

    private static BubbleSort bs;

    @BeforeAll
    static void setUp(){
        bs = new BubbleSort();
    }

    @Test
    @DisplayName("Given an array of negative and positive numbers, Bubble sort is expected to return a the sorted array")
    public void givenAnArrayOfPositiveNegativeValues_BubbleSort_ReturnsSorted(){
        int[] testInput = {-89, 76, 13, -27, 34, -4, 9};
        assertArrayEquals(new int[]{-89, -27, -4, 9, 13, 34, 76}, bs.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  negative numbers, Bubblesort is expected to return a the sorted array")
    public void givenAnArrayOfNegativeValues_BubbleSort_ReturnsSorted(){
        int[] testInput = {-89, -76, -13, -27, -34, -4, -9};
        assertArrayEquals(new int[]{-89, -76, -34, -27, -13, -9, -4}, bs.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  positive numbers, Bubble sort is expected to return a the sorted array")
    public void givenAnArrayOfPositiveValues_BubbleSort_ReturnsSorted(){
        int[] testInput = {89, 76, 13, 27, 34, 4, 9};
        assertArrayEquals(new int[]{4, 9, 13, 27, 34, 76, 89}, bs.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  zeros numbers, Bubble sort is expected to return a the sorted array")
    public void givenAnArrayOfZerosValues_BubbleSort_ReturnsSorted(){
        int[] testInput = {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0}, bs.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  repeated numbers, Bubble sort is expected to return a the sorted array")
    public void givenAnArrayOfRepeatedValues_BubbleSort_ReturnsSorted(){
        int[] testInput = {1,4,1,4,1,4,5,5,5,5,2,2,2};
        assertArrayEquals(new int[]{1,1,1,2,2,2,4,4,4,5,5,5,5}, bs.sort(testInput));
    }

    @Test
    @DisplayName("Given an null array, Bubble sort is expected to return null")
    public void givenAnNullArray_BubbleSort_ReturnsNull(){
        int[] testInput = null;
        assertArrayEquals(null , bs.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of 1 value, Bubble sort is expected to return original array")
    public void givenAnArrayOfOneValue_BubbleSort_ReturnsArray(){
        int[] testInput = {89};
        assertArrayEquals(new int[]{89} , bs.sort(testInput));
    }

}
