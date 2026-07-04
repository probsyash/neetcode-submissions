class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int[] ans = new int[k];

        for(int i = 0; i < nums.length; i++){
            if(numbers.containsKey(nums[i])){
                int value = numbers.get(nums[i]) + 1;
                numbers.put(nums[i], value);
            }
            else{
                numbers.put(nums[i], 1);
            }
        }

        for(int j = 0; j < ans.length; j++){
            int maxfreq = 0;
            int maxnum = 0;

            for(int key : numbers.keySet()){
                if(numbers.get(key) > maxfreq){
                    maxfreq = numbers.get(key);
                    maxnum = key;
                }
            }

            ans[j] = maxnum;
            numbers.remove(maxnum);
        }

        return ans;
    }
}
