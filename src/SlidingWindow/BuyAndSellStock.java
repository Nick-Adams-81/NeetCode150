package SlidingWindow;

public class BuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minVal) {
                minVal = prices[i];
            } else if(prices[i] - minVal > maxProfit) {
                maxProfit = prices[i] - minVal;
            }
        }
        return maxProfit;
    }

    public int maxProfit2(int[] prices) {
        int minValue = prices[0], maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }
        return maxProfit;
    }
}
