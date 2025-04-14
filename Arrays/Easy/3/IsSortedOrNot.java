public class IsSortedOrNot {

    public static boolean isSortedNot(int[] arr) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        boolean res = isSortedNot(arr);
        System.out.println("Is this array sorted or not : " + res);
    }
}