public class max_gap {
    public int maximumGap(int[] nums) {
        int diff=0, n = nums.length, i =1;
        Arrays.sort(nums);
        int max = 0;
        if(n<2){
            return max;
        }
        while(i<n){
            diff = (nums[i]-nums[i-1]);
            max = Math.max(max,diff);
            i++;
        }

        return max;
    }
}
