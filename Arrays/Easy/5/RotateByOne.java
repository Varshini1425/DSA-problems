
public class RotateByOne {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 5, 9 };
        rotateByOne(arr);
        System.out.print("After rotating the array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void rotateByOne(int[] arr) {

        int n = arr.length;
        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[n - 1] = temp;

    }
}
