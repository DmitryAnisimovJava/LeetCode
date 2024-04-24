package top_150;

import java.util.stream.IntStream;

public class RemoveElement27 {

    public static int removeElement1(int[] nums, int val) {
        int[] fullArray = IntStream.of(nums).filter(value -> value != val).toArray();
        int resultLength = fullArray.length;
        for (int i = 0; i < resultLength; i++) {
            nums[i] = fullArray[i];
        }
        return resultLength;
    }
    
    public static int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] test = {3, 2, 2, 3};
        System.out.println(RemoveElement27.removeElement1(test, 3));
    }
}
