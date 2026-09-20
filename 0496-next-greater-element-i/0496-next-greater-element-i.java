import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s= new Stack<>();
        int[] ans = new int[nums1.length];

        for(int i = 0; i<nums2.length; i++ ){
            int curr = nums2[i];
            while(!s.isEmpty() && curr > nums2[s.peek()] ){
                map.put(nums2[s.pop()], curr);
            }
            s.push(i);
        }

        for(int i = 0; i<nums1.length; i++){
            int key = nums1[i];
            if(map.containsKey(key)){
                ans[i] = map.get(key);
            }else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}