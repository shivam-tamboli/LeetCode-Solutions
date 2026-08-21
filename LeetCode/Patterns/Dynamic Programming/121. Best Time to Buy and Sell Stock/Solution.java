class Solution {
    public int maxProfit(int[] prices) {
        
        int minPro = prices[0];
        int maxPro = 0;


        for(int price : prices){
            if(price < minPro){
                minPro = price;
            }
        
            int profit = price - minPro;

            if(profit > maxPro){
                maxPro = profit;
            }
        }
        return maxPro;
    }
}