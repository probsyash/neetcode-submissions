class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(values.containsKey(nums[i])){
                values.put(nums[i], values.get(nums[i]) + 1);
            }
            else{
                values.put(nums[i], 1);
            }
        }

        int[] ans = new int[k];

        for(int j = 0; j < k; j++){
            int maxFreq = -1;
            int maxnum = 0;

            for(int key : values.keySet()){
                if(values.get(key) > maxFreq){
                    maxFreq = values.get(key);
                    maxnum = key;
                }
            }

            ans[j] = maxnum;
            values.remove(maxnum); 
        }

        return ans;
    }
}
