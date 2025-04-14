
public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 1, 2, 2, 5, 5, 5, 6, 6, 6, 7, 8 };
        int res = removeDupArr(nums);
        System.out.println("After removing the duplicate from the array: " + res);
    }

    private static int removeDupArr(int[] nums) {

        if (nums.length == 0)
            return 0;

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }
}
