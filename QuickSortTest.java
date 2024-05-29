import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        //testEmptyArray();
        testSingleElementArray();
        testSortedArray();
        testReverseSortedArray();
        testUnsortedArray();
        testArrayWithDuplicates();
        testArrayWithNegativeNumbers();
    }

    private static void testEmptyArray() {
        Integer[] array = {};
        testSort("Empty Array", array);
    }

    private static void testSingleElementArray() {
        Integer[] array = {1};
        testSort("Single Element Array", array);
    }

    private static void testSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        testSort("Sorted Array", array);
    }

    private static void testReverseSortedArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        testSort("Reverse Sorted Array", array);
    }

    private static void testUnsortedArray() {
        Integer[] array = {12, 11, 13, 5, 6, 7};
        testSort("Unsorted Array", array);
    }

    private static void testArrayWithDuplicates() {
        Integer[] array = {4, 5, 6, 4, 3, 4, 2, 1, 2, 3, 4};
        testSort("Array with Duplicates", array);
    }

    private static void testArrayWithNegativeNumbers() {
        Integer[] array = {-1, -3, -2, 5, 0, -4};
        testSort("Array with Negative Numbers", array);
    }

    private static void testSort(String testName, Integer[] array) {
        System.out.println("Testing " + testName + ":");
        System.out.println("Original Array: " + Arrays.toString(array));
        Sorter.quickSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println();
    }
}