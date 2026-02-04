class trionic_arr {
    public boolean isTrionic(int[] nums) {
        int i = 0;
        while(i+1 < nums.length && nums[i]<nums[i+1]){
            i++;
        } 
        if(i==0) return false;
        int inc = i;
        while( i+1 < nums.length && nums[i]>nums[i+1]){
            i++;
        }
        if(i==inc) return false;
        int dec = i;
        while(i+1<nums.length && nums[i]<nums[i+1]){
            i++;
        }
        if (i==dec) return false;

        return i == nums.length - 1;
    }
}