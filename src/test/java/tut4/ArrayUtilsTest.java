package tut4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void testArraySum_NormalCase() throws Exception {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 15;
        assertEquals(expected, ArrayUtils.ArraySum(arr));
    }

    @Test
    void testArraySum_SingleElement() throws Exception {
        int[] arr = {10};
        int expected = 10;
        assertEquals(expected, ArrayUtils.ArraySum(arr));
    }

    @Test
    void testArraySum_NegativeNumbers() throws Exception {
        int[] arr = {-1, -2, -3};
        int expected = -6;
        assertEquals(expected, ArrayUtils.ArraySum(arr));
    }

    @Test
    void testArraySum_NullArray() {
        int[] arr = null;
        Exception exception = assertThrows(Exception.class, () -> {
            ArrayUtils.ArraySum(arr);
        });
        assertEquals("Array is null", exception.getMessage());
    }

    @Test
    void testArraySum_EmptyArray() {
        int[] arr = {};
        Exception exception = assertThrows(Exception.class, () -> {
            ArrayUtils.ArraySum(arr);
        });
        assertEquals("Array is empty", exception.getMessage());
    }
}
