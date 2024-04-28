package github.souza.bernardo.algorithms;

public class BinarySearch {

    public int search(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == value) return middle;
            if (array[middle] < value) start = middle + 1;
            if (array[middle] > value) end = middle - 1;
        }
        return -1;
    }

    public int searchTree(int[] array, int value, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == value) return mid;
            if (array[mid] < value) return searchTree(array, value, mid + 1, array.length - 1);
            if (array[mid] > value) return searchTree(array, value, start, mid - 1);
        }
        return -1;
    }
}
