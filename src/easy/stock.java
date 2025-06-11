package easy;

import javax.swing.text.StyleContext;

public class stock {

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(
                maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int maxProfit=0; // we default maximum profit to return 0
        int minPrice=Integer.MAX_VALUE; // calculate the minimum price of a stock on a given day


        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            maxProfit=Math.max(maxProfit, prices[i] - minPrice);

        }
        return maxProfit;
    }


}
