class Solution {
    public int removeDuplicates(int[] nums) {

        int temp = nums[0];
        int k = 1;
        int p = 0;

        for (int i = 1; i < nums.length; i++) {
            while (i < nums.length && temp == nums[i]) {
                i++;
            }
            if (i < nums.length && temp != nums[i]) {
                k++;
                p++;
                temp = nums[i];
                nums[p] = temp;
            }
        }
        return k;
    }
}