package top_150;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray189 {

    public void rotate1(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int lastElement = nums.length - 1;
        int newFirst = nums[lastElement];
        for (int i = lastElement; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = newFirst;
        rotate1(nums, --k);
    }

    public void rotate2(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        if (length == 0 || length == 1) {
            return;
        }
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        new RotateArray189().rotate2(array, 3);
        System.out.println();
    }
}
