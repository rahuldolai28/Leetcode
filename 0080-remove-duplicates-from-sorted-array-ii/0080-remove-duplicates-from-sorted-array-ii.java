class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int r = 1;
        for(int i =1 ; i< nums.length ; i++){
            if( nums[i] == nums[i-1] ){
                r++;
                if(r<3){
                    k++;
                    nums[k] = nums[i];
                }
            }else{
                r=1;
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}