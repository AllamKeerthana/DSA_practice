class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = weights[0];
        int max = 0;
        for(int i = 0;i<weights.length;i++){
            min=Math.max(min,weights[i]);
            max+=weights[i];
        }
        int weight = max;
        int ans = Integer.MAX_VALUE;
        int mid = 0;
        while(min<=max){
            mid = min+(max-min)/2;
            if(poss(mid,weights,days)){
                ans = Math.min(ans,mid);
                max = mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;

    }
    static boolean poss(int mid, int[] weights, int days){
        int curr = 0;
        int daysused = 1;
        for(int weight: weights){
            
            if(curr+weight<=mid){
                curr+=weight;
            }
            else{
                daysused++;
                curr = weight;
            }
        }
        return daysused<=days;
    }
}