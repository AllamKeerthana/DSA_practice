class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        int[] pre = new int[n];
        for(int i = 0;i<n;i++){
            max = Math.max(nums[i],max);
            pre[i] = gcd(max,nums[i]);
        }
        Arrays.sort(pre);
        int left = 0;
        int right = n-1;
        long sum = 0;
        while(left<right){
            sum+=gcd(pre[left],pre[right]);
            left++;
            right--;
        }
        return sum;
    }
    static int gcd(int a ,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a =temp;
        }
        return a ;
    } 
}