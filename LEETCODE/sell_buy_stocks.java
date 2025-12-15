public class sell_buy_stocks {

    public int maxProfit(int[] prices) {
        int max = 0;
        int count = prices[0];
        for(int i =0;i<prices.length;i++){
            if(count>prices[i]){
                count = prices[i];
            }
            else{
                int prof = prices[i]-count;
                max = Math.max(max,prof);
            }
            
        }
        return max;
    }
}
