import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // skip dup i
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue; // skip dup j
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    long sum =(long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(
                                Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1])
                            l++; // skip dup l
                        while (l < r && nums[r] == nums[r + 1])
                            r--; // skip dup r
                    }

                    else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return result;
    }
}