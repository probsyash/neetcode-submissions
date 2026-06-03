class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> num = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(num.containsKey(nums[i])){
                return true;
            }
            else{
                num.put(nums[i],1);
            }
        }

        return false;
    }
}