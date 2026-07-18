class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(min>nums[i]) min = nums[i];
            if(max<nums[i]) max = nums[i];
        }

        while(max!=0){
            int temp = max;
            max = min%max;
            min = temp;
        }

        return min;
    }
}