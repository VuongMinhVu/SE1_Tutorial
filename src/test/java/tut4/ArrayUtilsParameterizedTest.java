package tut4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class ArrayUtilsParameterizedTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> provideArraysForSum() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new int[]{1, 2, 3}, 6),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{10, -5, 5}, 10),
                org.junit.jupiter.params.provider.Arguments.of(new int[]{100}, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForSum")
    void testArraySum_ValidCases(int[] input, int expected) throws Exception {
        int result = ArrayUtils.ArraySum(input);
        assertEquals(expected, result);
    }
    //null array
    @ParameterizedTest
    @MethodSource("provideNullArray")
    void testArraySum_NullArray(int[] input) {
        Exception exception = assertThrows(Exception.class, () -> {
            ArrayUtils.ArraySum(input);
        });
        assertEquals("Array is null", exception.getMessage());
    }

    static Stream<int[]> provideNullArray() {
        return Stream.of((int[]) null);
    }

    // Test cho trường hợp mảng rỗng
    @ParameterizedTest
    @MethodSource("provideEmptyArray")
    void testArraySum_EmptyArray(int[] input) {
        Exception exception = assertThrows(Exception.class, () -> {
            ArrayUtils.ArraySum(input);
        });
        assertEquals("Array is empty", exception.getMessage());
    }

    static Stream<int[]> provideEmptyArray() {
        return Stream.of(new int[]{});
    }
}
