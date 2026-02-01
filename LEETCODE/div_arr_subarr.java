class div_arr_subarr {
    public int minimumCost(int[] nums) {
        if(nums.length == 3 ){
            return nums[0]+nums[1]+nums[2];
        }
        int sum = nums[0];
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int i = 1; i<nums.length ; i++){
            if(first>nums[i]){
                sec = first;
                first = nums[i];
                
            }
            else if(sec>nums[i]){
                sec = nums[i];
            }
        }
        return sum+sec+first;
    }
}