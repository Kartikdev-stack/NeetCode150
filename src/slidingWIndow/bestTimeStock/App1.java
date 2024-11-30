package slidingWIndow.bestTimeStock;

// Brute Force Solution
public class App1 {
    public static void main(String[] args) {
      int[] prices={10,8,7,5,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

          int maxProfit=0;
          for(int i=0;i<prices.length-1;i++){
              for(int j=i+1;j<prices.length;j++){
                  maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
              }
          }
          return maxProfit;
    }

}
