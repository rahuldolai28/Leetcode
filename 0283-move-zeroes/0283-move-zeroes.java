class Solution {
    public void moveZeroes(int[] nums) {
        int slow = -1;
        for( int i = 0 ; i< nums.length ; i++ ){
           // initialize slow
           if(nums[i] == 0 && slow < 0){
            slow = i ;
           }
           //slow is not initialize yet
           if(slow == -1 ){
            continue;
           }
           // case 1 slow=0, i non zero
           if( nums[slow] ==0 && nums[i] != 0 ){
            nums[slow] = nums[i] ;
            nums[i] = 0;
            slow++;
           }
          

        }
    }
}