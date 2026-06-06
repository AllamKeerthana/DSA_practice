class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        int bulbs = (brightness+2)/3;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int s = intervals[0][0];
        int e = intervals[0][1];
        long active = 0;
        for(int i = 1;i<intervals.length;i++){
            int cs = intervals[i][0];
            int ce = intervals[i][1];
            if(cs<=e){
                e = Math.max(ce,e);
            }
            else{
                active+=(long)e - s +1;
                e = ce;
                s = cs;
            }
        }
        active += (long)e - s + 1;
        return (long)bulbs*active;
    }
}