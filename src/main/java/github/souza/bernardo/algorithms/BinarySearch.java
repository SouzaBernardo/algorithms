package github.souza.bernardo.algorithms;

public class BinarySearch {

    public int search(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {
                low = mid + 1;
            }
            if (array[mid] > value) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int searchRecursive(int[] array, int value, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {
                return searchRecursive(array, value, mid + 1, array.length - 1);
            }
            if (array[mid] > value) {
                return searchRecursive(array, value, low, mid - 1);
            }
        }
        return -1;
    }

}