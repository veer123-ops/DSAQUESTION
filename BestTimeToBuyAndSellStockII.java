package veer.com;

public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            // If today's price is higher than yesterday's, buy yesterday and sell today
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};;
        System.out.println("Max Profit: " + maxProfit(prices)); // Output: 9
    }
}
