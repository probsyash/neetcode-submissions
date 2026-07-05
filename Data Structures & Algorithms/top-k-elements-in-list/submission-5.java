class Solution {
    public int[] topKFrequent(int[] nums, int l) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int[] ans = new int[l];

        for(int i = 0; i < nums.length; i++){
            if(numbers.containsKey(nums[i])){
                numbers.put(nums[i], numbers.get(nums[i]) + 1);
            }
            else{
                numbers.put(nums[i], 1);
            }
        }

        for(int j = 0; j < ans.length; j++){
            int highest = 0;
            int maxfreq = 0;

            for(int k = 0; k < nums.length; k++){
                if(numbers.containsKey(nums[k])){
                    if(numbers.get(nums[k]) > maxfreq){
                        maxfreq = numbers.get(nums[k]);
                        highest = nums[k];
                    }
                }
            }

            ans[j] = highest;
            numbers.remove(highest);
        }

        return ans;
    }
}
