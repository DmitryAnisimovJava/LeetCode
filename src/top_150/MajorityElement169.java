package top_150;

import java.util.Arrays;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
 * always exists in the array.
 **/
public class MajorityElement169 {

    public int majorElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    public static void main(String[] args) {
        int[] checkResult = {1};
        int i = new MajorityElement169().majorElement(checkResult);
        System.out.println(i);
    }
}
