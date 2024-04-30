package array_string;

/**
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in
 * the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 **/
public class JumpGame55 {

    public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }


    public static void main(String[] args) {
        int[] nums = {2,3,0,1};
        boolean b = new JumpGame55().canJump(nums);
        System.out.println(b);
    }
}
