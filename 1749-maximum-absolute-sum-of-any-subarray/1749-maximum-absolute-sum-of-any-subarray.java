class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int currMin = nums[0];
        int currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], nums[i] + currMax);
            max = Math.max(max, currMax);
            currMin = Math.min(nums[i], nums[i] + currMin);
            min = Math.min(currMin, min);
        }
        return Math.max(Math.abs(min),max);
    }
}