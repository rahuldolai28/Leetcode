class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];

        int l = 0, r = numbers.length - 1;
        while (l <= r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                l++;
                r++;
                ans[0] = l;
                ans[1] = r;
                return ans;
            }
            if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
    return ans;
    } 
}