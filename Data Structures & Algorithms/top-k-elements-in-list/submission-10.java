class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int[] ans = new int[k];

        for(int i = 0; i < nums.length; i++){
            if(!numbers.containsKey(nums[i])){
                numbers.put(nums[i], 1);
            }
            else{
                numbers.put(nums[i], numbers.get(nums[i]) + 1);
            }
        }

        for(int j = 0; j < k; j++){
            int max = -1000;
            int highfreq = 0;

            for(int key : numbers.keySet()){
                if(numbers.get(key) > highfreq){
                    max = key;
                    highfreq = numbers.get(key);
                }
            }

            ans[j] = max;
            numbers.remove(max);
        }

        return ans;
    }
}
