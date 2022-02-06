import com.spartaglobal.model.BinarySearchTree;
import com.spartaglobal.model.MergeSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BstTest {

    private static BinarySearchTree bst;

    @BeforeAll
    static void setUp(){
        bst = new BinarySearchTree();
    }

    @Test
    @DisplayName("Given an array of negative and positive numbers, Bst sort is expected to return a the sorted array")
    public void givenAnArrayOfPositiveNegativeValues_BinarySearch_ReturnsSorted(){
        int[] testInput = {-89, 76, 13, -27, 34, -4, 9};
        assertArrayEquals(new int[]{-89, -27, -4, 9, 13, 34, 76}, bst.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  negative numbers, Bst sort is expected to return a the sorted array")
    public void givenAnArrayOfNegativeValues_BinarySearch_ReturnsSorted(){
        int[] testInput = {-89, -76, -13, -27, -34, -4, -9};
        assertArrayEquals(new int[]{-89, -76, -34, -27, -13, -9, -4}, bst.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  positive numbers, Bst sort is expected to return a the sorted array")
    public void givenAnArrayOfPositiveValues_BinarySearch_ReturnsSorted(){
        int[] testInput = {89, 76, 13, 27, 34, 4, 9};
        assertArrayEquals(new int[]{4, 9, 13, 27, 34, 76, 89}, bst.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  zeros numbers, Bst sort is expected to return a the sorted array")
    public void givenAnArrayOfZerosValues_BinarySearch_ReturnsSorted(){
        int[] testInput = {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0}, bst.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of  repeated numbers, Bst sort is expected to return a the sorted array")
    public void givenAnArrayOfRepeatedValues_BinarySearch_ReturnsSorted(){
        int[] testInput = {1,4,1,4,1,4,5,5,5,5,2,2,2};
        assertArrayEquals(new int[]{1,1,1,2,2,2,4,4,4,5,5,5,5}, bst.sort(testInput));
    }

    @Test
    @DisplayName("Given an null array, Bst sort is expected to return null")
    public void givenAnNullArray_BinarySearch_ReturnsNull(){
        int[] testInput = null;
        assertArrayEquals(null , bst.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of 1 value, Bst sort is expected to return original array")
    public void givenAnArrayOfOneValue_BinarySearch_ReturnsArray(){
        int[] testInput = {89};
        assertArrayEquals(new int[]{89} , bst.sort(testInput));
    }

}
