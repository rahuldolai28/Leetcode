class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }
        boolean findFirst = true;
        int first = find(nums, target, findFirst);
        findFirst = false;
        int last = find(nums, target, findFirst);

        return new int[] { first, last };
    }

    public int find(int[] nums, int target, boolean findFirst ) {
        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target && findFirst) {
                ans = mid;
                ei = mid - 1;
            } else if (nums[mid] == target && !findFirst) {
                ans = mid;
                si = mid + 1;
            } else if (nums[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return ans;
    }

}