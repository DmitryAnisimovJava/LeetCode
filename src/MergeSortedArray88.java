import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray88 {

    public static void solution(int[] nums1, int m, int[] nums2, int n) {
        int[] result = IntStream.concat(IntStream.of(Arrays.copyOf(nums1, m)), IntStream.of(nums2))
                .sorted()
                .toArray();
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }

    public static void solution2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m , j = 0; i < m + n ; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
//        MergeSortedArray88.solution(nums1, 3, nums2, 3);
        MergeSortedArray88.solution2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
