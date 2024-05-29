
public class Sorter<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void quickSort(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Can't sort a null array");
        }
        if(array.length == 0){
            throw new IllegalArgumentException("Cant sort an empty array");
        }
        quickSort(array, 0, array.length -1);
        }

    private static <T extends Comparable <T>> void quickSort (T[] array, int firstIndex, int lastIndex) {

        if (lastIndex > firstIndex) {
            int pivot = partition(array, firstIndex, lastIndex);
            quickSort(array, firstIndex, pivot - 1);
            quickSort(array, pivot + 1, lastIndex);
        }

    }
    public static <T extends Comparable<T>> void mergeSortNoRecursion(T[] array) {
        int size = array.length;

        for (int currentSize = 1; currentSize <= size - 1; currentSize = currentSize * 2) {
            for (int leftIndex = 0; leftIndex < size - 1; leftIndex = leftIndex + 2 * currentSize) {
                int middleIndex = Math.min(leftIndex + currentSize - 1, size - 1);
                int rightIndex = Math.min(leftIndex + currentSize * 2 - 1, size - 1);
                Merge(array, leftIndex, middleIndex, rightIndex);
            }

        }

    }

    public static void radixSort(Long[] array, int bitsPerDigit) {

    }

    static void countingSort(Long[] arr, int bitsPerDigit, int digitIndex) {

    }

    static int extractDigit(Long key, int bitsPerDigit, int digitIndex) {
        return 0;
    }

    private static <T extends Comparable<T>> void Merge(T[] array1, int left, int middle, int right) {
        int SizeLeftArray = middle - left + 1;
        int SizeRightArray = right - middle;

        T[] leftArray = (T[]) new Comparable[SizeLeftArray];
        T[] rightArray = (T[]) new Comparable[SizeRightArray];

        System.arraycopy(array1, left, leftArray, 0, SizeLeftArray);
        System.arraycopy(array1, middle + 1, rightArray, 0, SizeRightArray);

        int i = 0, j = 0, k = left;

        while (i < SizeLeftArray && j < SizeRightArray) {
            if (leftArray[i].compareTo(rightArray[j]) < 0) {
                array1[k] = leftArray[i];
                i++;
            } else {
                array1[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < SizeLeftArray) {
            array1[k] = leftArray[i];
            k++;
            i++;
        }
        while (j < SizeRightArray) {
            array1[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static <T extends Comparable<T>> void BubbleSort(T[] bubbleArray, int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            if (bubbleArray[i].compareTo(bubbleArray[i - 1]) < 0) {
                Swap(bubbleArray, i, i - 1);
            }
        }
    }

    private static <T extends Comparable <T>> void Swap (T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static <T extends Comparable<T>> int partition(T[] array, int firstIndex, int lastIndex) {
       int randomIndex =(int)(Math.random()*(lastIndex-firstIndex + 1) + firstIndex);
       Swap(array, randomIndex, lastIndex);
       T pivot = array[lastIndex];
       int i = firstIndex-1;
       for (int j = firstIndex; j<lastIndex; j++){
           if (array[j].compareTo(pivot) <=0){
               i++;
               Swap(array, i, j);
           }
       }
       Swap(array, i+1, lastIndex);
       return i+1;
    }
}
//* private static <T extends Comparable <T>> int partition (T[] array, int firstIndex, int lastIndex) {
//        int randomIndex = firstIndex + (int) (Math.random() * (lastIndex - firstIndex + 1));
//        swap(array, randomIndex, lastIndex);
//        T pivot = array[lastIndex];
//        int i = firstIndex - 1;
//
//        for (int l = firstIndex; l < lastIndex; l++) {
//            if (array[l].compareTo(pivot) <= 0) {
//                i++;
//                swap(array, i, l);
//            }
//        }
//
//        swap(array, i + 1, lastIndex);
//
//        return i + 1;
//    }**/
