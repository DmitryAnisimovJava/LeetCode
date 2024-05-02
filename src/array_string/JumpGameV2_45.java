package array_string;

public class JumpGameV2_45 {

    public int jump(int[] nums) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
            if (curFarthest >= nums.length - 1) {
                break;
            }
        }
        return jumps;


    }



    public static void main(String[] args) {
        int[] input = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};

        int jump = new JumpGameV2_45().jump(input);
        System.out.println(jump);
    }
}
