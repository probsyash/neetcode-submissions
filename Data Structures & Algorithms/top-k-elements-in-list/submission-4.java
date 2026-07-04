class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int[] ans = new int[k];

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

            for(int key : numbers.keySet()){
                if(numbers.get(key) > maxfreq){
                    highest = key;
                    maxfreq = numbers.get(key);
                }
            }

            ans[j] = highest;
            numbers.remove(highest);
        }

        return ans;
    }
}
