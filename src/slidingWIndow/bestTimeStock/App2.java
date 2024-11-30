package slidingWIndow.bestTimeStock;

public class App2 {

    public static void main(String[] args) {
        int[] prices={10,12,5,6,7,9};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int profit=0;
        int minPrice=prices[0];

        for(int i=1;i< prices.length;i++){
             minPrice=Math.min(minPrice,prices[i]);
             profit=Math.max(profit,prices[i]-minPrice);

        }

       return profit;
    }

}
