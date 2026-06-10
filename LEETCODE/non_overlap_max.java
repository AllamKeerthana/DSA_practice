class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int n = intervals.length;
        int end = intervals[0][1];
        for(int i = 1;i<n;i++){
            int curr = intervals[i][0];
            if(curr>=end){
                end = intervals[i][1];
            }
            else count++;
        }
        return count;
    }
}