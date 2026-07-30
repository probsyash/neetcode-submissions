class Solution {
    int[][] cache;
    public int rob(int[] nums) {
        cache = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            cache[i][0] = -1;
            cache[i][1] = -1;
        }
        return Math.max(dfs(0,1,nums), dfs(1,0, nums));
    }

    public int dfs(int n, int flag, int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        if(n >= nums.length || (flag == 1 && n == nums.length - 1)){
            return 0;
        }
        if(cache[n][flag] != -1){
            return cache[n][flag];
        }
        else{
            return cache[n][flag] = Math.max(dfs(n+1, flag, nums), nums[n] + dfs(n+2, flag | (n == 0 ? 1:0), nums));
        }
    }
}
