import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray80 {

    public static int removeDuplicates(int[] nums) {
        int size = 1;
        int prevValue = nums[0];
        boolean duplicate = false;
        for(int i=1; i<nums.length; i++) {
            nums[size] = nums[i];
            if(prevValue != nums[i]) {
                prevValue = nums[i];
                size++;
                duplicate = false;
            } else if (prevValue == nums[i]  && !duplicate){
                prevValue = nums[size++];
                duplicate = true;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] test = {1,1,1,1,1,2};
        RemoveDuplicatesfromSortedArray80.removeDuplicates(test);
    }
}
