class Solution {
    public int search(int[] nums, int target) {
        boolean flag = false;
        int index = 0;

        int mid = nums.length / 2;
        int min = 0;
        int max = nums.length - 1;

        while(!flag && (min <= max)){
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                max = mid - 1;
                mid = min + (max - min) / 2;
            }
            else{
                min = mid + 1;
                mid = min + (max - min) / 2;
            }
        }

        return -1;
    }
}
