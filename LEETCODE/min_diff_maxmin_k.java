class min_diff_maxmin_k {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 0|| nums.length ==1) return 0;
        // here i did bubble sort which is more time takung than other sorting so 
        // use optimal one like quicksort something like that 
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<=nums.length - k;i++){
            min = Math.min(min,nums[i+k-1]-nums[i]);
        }
        
        
        return min;
    }
}