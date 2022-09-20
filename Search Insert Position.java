class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0] || target <= nums[0] && nums.length == 1) return 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(target >= nums[i] && target <= nums[i+1]){
                return i + 1;
            }
        }
        return nums.length;
    }
}
