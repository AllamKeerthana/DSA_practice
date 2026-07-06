class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });

        int maxend = intervals[0][1];
        int count = 1;
        for(int i = 1;i<intervals.length;i++){
            int end = intervals[i][1];
            if(end<=maxend) continue;
            else{
                count++;
                maxend=end;
            }
        }
        return count;
    }
}