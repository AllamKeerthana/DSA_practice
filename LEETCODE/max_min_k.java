class max_min_k {
    public int absDifference(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        Arrays.sort(nums);
        int sum = 0;
        int least = 0;
        int i =0;
        while(i<k){
            sum+=nums[i];
            i++;
        }

        for(int n = nums.length-1; n>=nums.length-k;n--){
            least+=nums[n];
        }

        return Math.abs(sum-least);
    }
}