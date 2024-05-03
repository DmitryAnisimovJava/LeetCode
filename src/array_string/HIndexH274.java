package array_string;

import java.util.Arrays;

/**
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their
 * ith paper, return the researcher's h-index.
 * <p>
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that
 * the given researcher has published at least h papers that have each been cited at least h times.
 */
public class HIndexH274 {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i]) {
                hIndex = Math.max(citations.length - i, hIndex);
            }
        }
        return hIndex;
    }

    public static void main(String[] args) {
        int[] array = {8, 8, 8, 8};
        int i = new HIndexH274().hIndex(array);
        System.out.println();
    }
}
