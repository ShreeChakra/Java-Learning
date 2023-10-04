package Arrays;

public class StocksMaxProfit {
    public static int getMaxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 1, 7, 6, 4, 2, 9 };
        System.out.print(getMaxProfit(prices));
    }
}