public class Testing {
    // Sorts a given array using the QuickSort algorithm.
    public static <T extends Comparable <T>> void quickSort (T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The Array Is Empty."); //good exception?
        }

        quickSort(array, 0, array.length - 1);

    }

    // Sorts a given array from a beginning index to an ending index, using the Quick Sort
    // algorithm.
    private static <T extends Comparable <T>> void quickSort (T[] array, int firstIndex, int lastIndex) {

        if (lastIndex > firstIndex) {
            int pivot = partition(array, firstIndex, lastIndex);
            quickSort(array, firstIndex, pivot - 1);
            quickSort(array, pivot + 1, lastIndex);
        }

    }

    // Partitions a given array from a beginning index to an ending index, according
    // to a random element as the pivot.
    private static <T extends Comparable <T>> int partition (T[] array, int firstIndex, int lastIndex) {
        int randomIndex = firstIndex + (int) (Math.random() * (lastIndex - firstIndex + 1));
        swap(array, randomIndex, lastIndex);
        T pivot = array[lastIndex];
        int i = firstIndex - 1;

        for (int l = firstIndex; l < lastIndex; l++) {
            if (array[l].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, l);
            }
        }

        swap(array, i + 1, lastIndex);

        return i + 1;
    }

    // Swaps two elements in a given array of type T.
    private static <T extends Comparable <T>> void swap (T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
