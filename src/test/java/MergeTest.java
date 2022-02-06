import com.spartaglobal.model.MergeSort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTest {

    private static MergeSort ms;

    @BeforeAll
    static void setUp(){
        ms = new MergeSort();
    }

    @Test
    @DisplayName("Given an array of negative and positive numbers, Merge sort is expected to return a the sorted array")
    public void givenAnArrayOfPositiveNegativeValues_MergeSort_ReturnsSorted(){
        int[] testInput = {-89, 76, 13, -27, 34, -4, 9};
        assertArrayEquals(new int[]{-89, -27, -4, 9, 13, 34, 76}, ms.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  negative numbers, Merge sort is expected to return a the sorted array")
    public void givenAnArrayOfNegativeValues_MergeSort_ReturnsSorted(){
        int[] testInput = {-89, -76, -13, -27, -34, -4, -9};
        assertArrayEquals(new int[]{-89, -76, -34, -27, -13, -9, -4}, ms.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  positive numbers, Merge sort is expected to return a the sorted array")
    public void givenAnArrayOfPositiveValues_MergeSort_ReturnsSorted(){
        int[] testInput = {89, 76, 13, 27, 34, 4, 9};
        assertArrayEquals(new int[]{4, 9, 13, 27, 34, 76, 89}, ms.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  zeros numbers, Merge sort is expected to return a the sorted array")
    public void givenAnArrayOfZerosValues_MergeSort_ReturnsSorted(){
        int[] testInput = {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0}, ms.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  repeated numbers, Merge sort is expected to return a the sorted array")
    public void givenAnArrayOfRepeatedValues_MergeSort_ReturnsSorted(){
        int[] testInput = {1,4,1,4,1,4,5,5,5,5,2,2,2};
        assertArrayEquals(new int[]{1,1,1,2,2,2,4,4,4,5,5,5,5}, ms.sort(testInput));
    }

    @Test
    @DisplayName("Given an null array, Merge sort is expected to return null")
    public void givenAnNullArray_MergeSort_ReturnsNull(){
        int[] testInput = null;
        assertArrayEquals(null , ms.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of 1 value, Merge sort is expected to return original array")
    public void givenAnArrayOfOneValue_MergeSort_ReturnsArray(){
        int[] testInput = {89};
        assertArrayEquals(new int[]{89} , ms.sort(testInput));
    }


}
