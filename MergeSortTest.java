import java.util.Arrays;

public class MergeSortTest {

    public static void main(String[] args) {
        testEmptyArray();
        testSingleElementArray();
        testSortedArray();
        testReverseSortedArray();
        testUnsortedArray();
        testArrayWithDuplicates();
        testArrayWithNegativeNumbers();
    }

    private static void testEmptyArray() {
        Integer[] array = {};
        System.out.println("Test Empty Array:");
        System.out.println("Original: " + Arrays.toString(array));
        Sorter.mergeSortNoRecursion(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println();
    }

    private static void testSingleElementArray() {
        Integer[] array = {1};
        System.out.println("Test Single Element Array:");
        System.out.println("Original: " + Arrays.toString(array));
        Sorter.mergeSortNoRecursion(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println();
    }

    private static void testSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Test Sorted Array:");
        System.out.println("Original: " + Arrays.toString(array));
        Sorter.mergeSortNoRecursion(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println();
    }

    private static void testReverseSortedArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        System.out.println("Test Reverse Sorted Array:");
        System.out.println("Original: " + Arrays.toString(array));
        Sorter.mergeSortNoRecursion(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println();
    }

    private static void testUnsortedArray() {
        Integer[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Test Unsorted Array:");
        System.out.println("Original: " + Arrays.toString(array));
        Sorter.mergeSortNoRecursion(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println();
    }

    private static void testArrayWithDuplicates() {
        Integer[] array = {4, 5, 6, 4, 3, 4, 2, 1, 2, 3, 4};
        System.out.println("Test Array with Duplicates:");
        System.out.println("Original: " + Arrays.toString(array));
        Sorter.mergeSortNoRecursion(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println();
    }

    private static void testArrayWithNegativeNumbers() {
        Integer[] array = {-1, -3, -2, 5, 0, -4};
        System.out.println("Test Array with Negative Numbers:");
        System.out.println("Original: " + Arrays.toString(array));
        Sorter.mergeSortNoRecursion(array);
        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println();
    }
}