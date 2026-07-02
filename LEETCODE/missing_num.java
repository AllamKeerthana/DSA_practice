class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // int sum = 0;
        // int total = n*(n+1)/2;

        // for(int i: nums){
        //     sum+=i;
        // }
        // return total - sum;
        int xor = n;
        for(int i = 0;i<n;i++){
            xor = xor^i^nums[i];
        }
        return xor;
    }
}