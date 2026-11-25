class Solution {
    public int findPeakElement(int[] nums) {
        int idx = find(nums, 0, nums.length - 1);
        return idx;
    }

    public int find(int[] nums, int low, int high) {

        if(low>high){
            return -1;
        }

        int mid = low + (high - low) / 2;

        if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
            return mid;
        }
        int left = find(nums,low,mid-1);

        if(left == -1){
            return find(nums,mid+1,high);
        }else{
            return left;
        }
    }
}