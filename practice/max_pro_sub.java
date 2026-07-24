class Solution {
    int maxProduct(int[] arr) {
        // code here
        int minprev = arr[0];
        int maxprev = arr[0];
        int ans = arr[0];
        
        for(int i = 1;i<arr.length;i++){
            int tempmax = maxprev;
            maxprev = Math.max(arr[i],Math.max(arr[i]*maxprev,arr[i]*minprev));
            minprev = Math.min(arr[i],Math.min(arr[i]*tempmax,arr[i]*minprev));
            
            ans = Math.max(ans,maxprev);
        }
        return ans;
    }
}