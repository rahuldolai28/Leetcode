import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> s = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];

      

        for(int i = 0; i<temperatures.length; i++ ){
            int curr = temperatures[i];
            while(!s.isEmpty() && curr > temperatures[s.peek()] ){
                int idx = s.pop();
               ans[idx]= i-idx;
            }
            s.push(i);
        }
        return ans;
    }
}