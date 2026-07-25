class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        int org = n;
        while(org>0){
            int rem = org%10;
            list.offer(rem);
            org/=10;
        }

        int pro = 1;
        pro*=list.poll();
        pro*=list.poll();
        return pro;   
    }
}