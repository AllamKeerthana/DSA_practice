class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1]));
        for(int i = 0;i<points.length;i++){
            int[] arr = {points[i][0],points[i][1]};
            int dis = arr[0]*arr[0]+arr[1]*arr[1];
            if(q.size()<k){
                q.offer(arr);
            }
            else{
                int[] top = q.peek();
                int topDis = top[0]*top[0] + top[1]*top[1];
                if(dis<topDis){
                    q.poll();
                    q.offer(arr);
                }
            }

        }

        int[][] ans = new int[k][2];
        int r = 0;
        while(!q.isEmpty()){
            int[] unit = q.poll();
            ans[r][0] = unit[0];
            ans[r][1] = unit[1];
            r++;
        }
        return ans;
    }
}