package top_150;

import javax.print.DocFlavor;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
 * future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int minimum = findProfitForElement(prices, 0, 0);
        for (int i = 1; i < prices.length; i++) {
            int nextMinimum = findProfitForElement(prices, i, minimum);
            minimum = Math.max(minimum, nextMinimum);
        }
        return minimum;
    }

    private int findProfitForElement(int[] prices, int index, int minimum) {
        int difference = 0;
        int profit = minimum;
        int element = prices[index];
        for (int i = ++index; i < prices.length; i++) {
            difference = prices[i] - element;
            if (difference <= 0) {
                return profit;
            }
            profit = Math.max(profit, difference);
        }
        return profit;
    }

    public int fromSoltions(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        int maxProfit = new BestTimeToBuyAndSellStock121().maxProfit(prices);
        System.out.println();
    }

}
