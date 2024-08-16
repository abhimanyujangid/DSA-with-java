//  you are given an array price where price[i] is the price of a given stock on the ith day.
// you want to maximize your profit by choosing a single day to but one stock and choosing a diffrent 
// day in the future to sell that stock.
// Return the maximum profit you can archive from this transaction, id you cannot archove any profit ,retun 0

public class buyAndSell {
    public static int Buysellfunction(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int idx = 0; idx < prices.length; idx++) {
            if (buyPrice < prices[idx]) {
                int profit = prices[idx] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[idx];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Buysellfunction(prices));

    }
}
