
public class SecondSmall2 {

    public static void main(String[] args) {
        int[] arr = { 10, 15 };
        int res = findSecLargest(arr);
        System.out.println("Largest element: " + res);
    }

    private static int findSecLargest(int[] arr) {

        int largestEle = Integer.MIN_VALUE;
        int secLarEle = Integer.MIN_VALUE;

        // Step 1 find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (largestEle < arr[i]) {
                largestEle = arr[i];
            }
        }

        // Step 2 find the second largest and ingnore the largest

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largestEle && arr[i] > secLarEle) {
                secLarEle = arr[i];
            } else if (secLarEle == Integer.MIN_VALUE) {
                return -1;

            }
        }
        return secLarEle;

    }
}
