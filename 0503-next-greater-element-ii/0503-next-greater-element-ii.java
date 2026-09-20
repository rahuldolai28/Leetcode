import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {
            int curr = nums[i % n];

            while (!s.isEmpty() && curr > nums[s.peek()]) {
                ans[s.pop()] = curr;
            }
            if(i<n){
                s.push(i);
            }
        }
        return ans;
    }
}