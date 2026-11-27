class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] == target) return mid;
            boolean leftSorted = nums[lo] <= nums[mid];
            boolean inLeft = nums[lo] <= target && target < nums[mid];
            boolean inRight = nums[mid] < target && target <= nums[hi];
            if (leftSorted ? inLeft : !inRight) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }
}