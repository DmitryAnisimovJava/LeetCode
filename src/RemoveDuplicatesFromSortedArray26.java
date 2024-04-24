import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] = nums[length - 1];
                counter++;
            }
        }
        Arrays.sort(nums);
        return length - counter;
    }

    public int solution2(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
