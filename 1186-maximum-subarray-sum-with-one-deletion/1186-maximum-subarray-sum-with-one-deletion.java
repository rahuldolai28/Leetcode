class Solution {
    public int maximumSum(int[] arr) {
        int curr = arr[0];
        int oneDel = arr[0];
        int max = arr[0] ;

        for (int i = 1; i < arr.length; i++) {

            // if oneDel = curr it means delete i right now
            // if onedel = oneDel + arr[i] , it means one i  deleted before
            oneDel = Math.max(curr, oneDel + arr[i]);
            curr = Math.max(curr + arr[i], arr[i]);
            max = Math.max(Math.max(oneDel, curr),max);

        }
        return max;
    }
}