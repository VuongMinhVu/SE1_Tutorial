package tut4;

public class ArrayUtils {
    public static int ArraySum(int[] arr) throws Exception {
        if (arr == null) {
            throw new Exception("Array is null");
        }
        if (arr.length == 0) {
            throw new Exception("Array is empty");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
