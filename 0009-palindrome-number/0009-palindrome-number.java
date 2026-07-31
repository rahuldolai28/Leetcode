class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
           return true; 
        }

        //recursion
        int ans = find(x,0);
        if(ans==x){
            return true;
        }else{
            return false;
        }
    }
    public static int find (int x, int temp){

        if (x == 0){
            return temp;
        }

        temp = temp*10 + x%10;
        x /= 10;
       return find( x, temp);
    }
}