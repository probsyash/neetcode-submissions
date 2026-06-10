class Solution {
    public int search(int[] nums, int target) {
        int max = nums.length - 1;
        int mid = nums.length/2;
        int min = 0;

        while(min <= max){
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                min = mid + 1;
                mid = (max + min) / 2;
            }
            else{
                max = mid - 1;
                mid = (max + min) / 2;
            }
        }

        return -1;
    }
}
