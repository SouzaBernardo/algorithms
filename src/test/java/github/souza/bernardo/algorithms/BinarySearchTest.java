package github.souza.bernardo.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void find() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 3;
        int result = binarySearch.search(array, target);
        int resultRecursive = binarySearch.searchRecursive(array, target, 0 , 10);
        assertEquals(2, result);
        assertEquals(2, resultRecursive);
    }

    @Test
    public void find2() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int result = binarySearch.search(array, target);
        int resultRecursive = binarySearch.searchRecursive(array, target, 0 , 10);
        assertEquals(9, result);
        assertEquals(9, resultRecursive);
    }

    @Test
    public void find3() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int result = binarySearch.search(array, target);
        int resultRecursive = binarySearch.searchRecursive(array, target, 0 , 10);
        assertEquals(-1, result);
        assertEquals(-1, resultRecursive);
    }
}