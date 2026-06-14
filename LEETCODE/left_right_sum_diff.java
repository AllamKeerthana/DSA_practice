class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] rig = new int[n];
        int l = 0;
        for(int i = 0;i<n;i++){
            left[i]+=l;
            l+=nums[i];
        }
        int r = 0,j = 0;
        
        for(int i = n-1;i>=0;i--){
            rig[i]+=r;
            r+=nums[i];  
        }

        for(int i = 0;i<n;i++){
            nums[i]=Math.abs(left[i]-rig[i]);
        }
        return nums;


    }
}