package github.souza.bernardo.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @ParameterizedTest
    @MethodSource("scenarios")
    public void find(int target, int positionExpected) {
        var array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var result = binarySearch.search(array, target);
        var resultRecursive = binarySearch.searchRecursive(array, target, 0, array.length);
        assertEquals(positionExpected, result);
        assertEquals(positionExpected, resultRecursive);
    }

    public static Stream<Arguments> scenarios() {
        return of(arguments(2, 1), arguments(11, -1), arguments(10, 9), arguments(8, 7), arguments(4, 3));
    }

}