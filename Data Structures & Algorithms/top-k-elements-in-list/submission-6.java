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

        for(int i = 0; i < k; i++){
            int max = -1000;
            int highest = 0;

            for(int key: numbers.keySet()){
                if(numbers.get(key) > max){
                    max = numbers.get(key);
                    highest = key;
                }
            }

            ans[i] = highest;
            numbers.remove(highest);
        }

        return ans;
    }
}
