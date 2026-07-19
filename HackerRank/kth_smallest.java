class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : arr){
            q.offer(n);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}
