package array_string;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any
 * time. However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 */

public class BestTimeToBuyAndSellStock122V2 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int price : prices) {
            if (price > buy) {
                profit += (price - buy);
                buy = price;
            } else if (price < buy) {
                buy = price;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int maxProfit = new BestTimeToBuyAndSellStock122V2().maxProfit(prices);
        System.out.println(maxProfit);
    }
}
