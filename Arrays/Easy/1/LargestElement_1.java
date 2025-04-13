import java.util.Arrays;

public class LargestElement_1 {

    public static int findLargest(int[] arr) {

        // By using a sorting method it will mutate the original array

        System.out.println("Before logic: " + Arrays.toString(arr));
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxEle < arr[i]) {
                maxEle = arr[i];
            }
        }
        System.out.println("After logic: " + Arrays.toString(arr));

        return maxEle;

    }

    public static void main(String[] args) {
        int[] arr = { 15, 7, 8, 20, 10 };
        int res = findLargest(arr);
        System.out.println("Largest element: " + res);
    }
}