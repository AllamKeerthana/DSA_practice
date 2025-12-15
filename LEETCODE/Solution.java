class Solution {
    public int countPartitions(int[] nums) {
       int count =0;
       int n = nums.length;
       for(int i =0;i<n;i++){
        int left = 0, right =0;
        int l = i, r = n- i -1;
        while(i>=0){
            left+=nums[i];
            l--;
        }
        while(r>i){
            right+=nums[n-r];
            r--;
        }
        if(Math.abs(left-right)%2==0) count++;
       }
       return count;
        
    }
    public static void main(String[] args){
        int[] arr = {10,10,3,7,6};
        Solution obj = new Solution();
        int result = obj.countPartitions(arr);
        System.out.println(result);
    }
}