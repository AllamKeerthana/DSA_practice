public class count_partitions_even {

    public int countPartitions(int[] nums) {
       int count =0;
       int n = nums.length;
       for(int i =0;i<n-1;i++){
        int left = 0, right =0;
        int l = i, r = n -1;
        while(l>=0){
            left+=nums[l];
            l--;
        }
        while(r>i){
            right+=nums[r];
            r--;
        }
        if(Math.abs(left-right)%2==0) count++;
       }
       return count;  
    }
}

