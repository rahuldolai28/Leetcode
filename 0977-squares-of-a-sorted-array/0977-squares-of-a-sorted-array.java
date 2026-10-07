class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int si = 0;
        int ei = nums.length-1;
        int i = nums.length-1;
        while(si<=ei){
            if((nums[si]*nums[si]) < nums[ei]*nums[ei] ){
                ans[i] = nums[ei]*nums[ei];
                ei--;
            }else{
                ans[i] = nums[si]*nums[si];
                si++;
            }
            i--;
        }
        return ans;
    }
}