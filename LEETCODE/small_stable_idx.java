class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int[] Max = new int[nums.length];
       int[] Min = new int[nums.length];
       int max = 0;
       for(int i = 0;i<nums.length;i++){
        max = Math.max(max,nums[i]);
        Max[i] = max;
       } 
        int min = Integer.MAX_VALUE;
       for(int i = nums.length-1;i>=0;i--){
        min = Math.min(min,nums[i]);
        Min[i] = min;
       }

       for(int i = 0;i<nums.length;i++){
        if(Max[i]-Min[i]<=k) return i;
       }
       return -1;
    }
}