class Solution {
    public int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int temp = 0;
        //leftmax
        for(int i = 0; i < height.length; i++){
            if(i==0){
                temp = height[i];
                leftMax[i] = temp;
            }else{
                temp = Math.max(temp, height[i-1]);
                leftMax[i] = temp;
            }
        }
        //rightmax
        for(int i = height.length -1 ; i>=0; i--){
            if(i == height.length -1){
                temp = height[i];
                rightMax[i] = temp; 
            }else{
                temp = Math.max(temp, height[i+1]);
                rightMax[i] = temp;
            }
        }
        //calculate
        int water = 0;
        for(int i = 0; i< height.length; i++){
            temp = Math.min(leftMax[i],rightMax[i]) - height[i];
            if(temp>0){
                water += temp;
            }
        }
        return water;
    }
}