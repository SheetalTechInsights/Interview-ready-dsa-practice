package Arrays;

public class StockBuyAndSell {
    public int maxProfit(int []arr){
       int  minPrice =arr[0];
       int maxProfit =0;
       for(int i =1;i<arr.length;i++) {
          if(arr[i]<minPrice){
              minPrice = arr[i];
          }else {
              maxProfit = Math.max(maxProfit,arr[i]-minPrice);
          }
       }
return maxProfit;
    }
    public static void main(String[] args) {
          int []arr = {7,1,5,3,6,4};
          StockBuyAndSell st = new StockBuyAndSell();

        System.out.println(st.maxProfit(arr));
    }
}
