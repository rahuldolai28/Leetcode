import java.util.*;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int sorted[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted);
        int l = 0, r = nums.length - 1;

        while (l < r && nums[l] == sorted[l]) {
            l++;
        }
        while (l < r && nums[r] == sorted[r]) {
            r--;
        }
        if (l == r) {
            return 0;
        } else {
            return (r - l + 1);
        }

    }
}