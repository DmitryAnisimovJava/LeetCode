package array_string;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
 * elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] suffix = new int[numsLength];
        int[] prefix = new int[numsLength];
        prefix[0] = suffix[numsLength - 1] = 1;
        int[] finalArray = new int[numsLength];
        int temp = 1;
        for (int i = 0; i < numsLength - 1; i++) {
            temp *= nums[i];
            prefix[i + 1] = temp;
        }
        temp = 1;
        for (int i = numsLength - 1 ; i > 0; i--) {
            temp *= nums[i];
            suffix[i - 1] = temp;
        }
        for (int i = 0; i < numsLength; i++) {
            finalArray[i] = prefix[i] * suffix[i];
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = new ProductOfArrayExceptSelf().productExceptSelf(nums);
        System.out.println();
    }
}
