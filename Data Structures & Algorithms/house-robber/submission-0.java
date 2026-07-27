class Solution {
    int[] cache;
    public int rob(int[] nums) {
        cache = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            cache[i] = -1;
        }
        return dfs(nums, 0);
    }

    public int dfs(int[] nums, int i){
        if(i >= nums.length){
            return 0; //no valid houses left to rob --> overshot
        }
        if(cache[i] != -1){
            return cache[i];
        }
        
        return cache[i] = Math.max( //math.max returns the greater of the two values
            dfs(nums, i+1), // skip house i and rob the adjacent one
            nums[i] + dfs(nums, i + 2) // rob house i and skip adjacent before jumping to the next
        );
    }
}
