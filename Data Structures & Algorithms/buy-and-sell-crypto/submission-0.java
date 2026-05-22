class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                int original = prices[i];
                int current = prices[j];

                int diff = current - original;

                if(diff > max){
                    max = diff;
                }
            }
        }

        return max;
    }
}
