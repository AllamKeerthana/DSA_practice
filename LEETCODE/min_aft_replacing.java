class Solution {
    public int minElement(int[] nums) {
       int sum = Integer.MAX_VALUE;
       for(int i = 0;i<nums.length;i++){
        String num = String.valueOf(nums[i]);
        int c = 0;
        for(char ch : num.toCharArray()){
            c+=  ch - '0';
        }
        nums[i] = c;
        if(sum>c) sum = c;
       }
       return sum;
    }
}