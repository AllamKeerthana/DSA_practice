class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = nums[0];
        long max = nums[0];

        for(int num : nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        return k*(max-min);
    }
}