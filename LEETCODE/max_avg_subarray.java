public class max_avg_subarray {

    public double findMaxAverage(int[] nums, int k) {
        //         brute force 
        // double max = -Double.MAX_VALUE;
        // double count = 0;
        // int n = nums.length;
        // for(int i =0;i<=n-k;i++){
        //     if((i+k-1)<=n-1){
        //         for(int j = i;j<=i+k-1;j++){
        //             count+=nums[j];
        //         }
        //         count/=k;
        //         max = Math.max(max,count);
        //         count = 0;
        //     }
        //     else {
        //         return max;
        //     }

        // }
        // if(n==1) return nums[0];
        // return max;

        double windowSum = 0;
        double maxSum = -Double.MIN_VALUE;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;
        // slide window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i]; // adding the new ele 
            windowSum -= nums[i - k]; // sub the old ele
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum/k;
    }
}

