class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 0;
        for(int i : piles){
            max=Math.max(max,i);
        }
        int ans = 0;
        int mid = 0;
        while(low<=max){
            mid = (low+max)/2;
            if(poss(piles,mid,h)) {
                ans = mid;
                max = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    static boolean poss(int[] piles,int mid,int h){
        long time = 0;
        for(int i : piles){
            time+=(int)Math.ceil((double)i/mid);
        }
        if(time<=h) return true;
        return false;
    }
}