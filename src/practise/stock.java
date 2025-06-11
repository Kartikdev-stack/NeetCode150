package practise;

public class stock {

    public static void main(String[] args) {
        int[] prices={10,1,5,6,7,1};
        System.out.println(maxProfit(prices));
    }

    //Brute force way
//    public static int maxProfit(int[] prices){
//        int maxProfit=0;
//        int current=0;
//
//        for(int i=0;i<prices.length-1;i++){
//            for(int j=i+1;j<prices.length;j++){
//                current=prices[j]-prices[i];
//                maxProfit=Math.max(current,maxProfit);
//            }
//        }
//
//        return maxProfit;
//    }

    // Sliding Window Optimised Approach // O(n) approach
    public static int maxProfit(int[] prices){
        int minPrice=prices[0];
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){
             minPrice=Math.min(minPrice,prices[i]);
             maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }

        return maxProfit;
    }

}
