class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            int c = target - nums[i];
            if(hm.containsKey(c)){
                arr[0] = hm.get(c);
                arr[1] = i;
                return arr;
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}