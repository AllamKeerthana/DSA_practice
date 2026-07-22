class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(q.size()<k){
                q.offer(entry);
            }
            else{
                if(entry.getValue()>q.peek().getValue()){
                    q.poll();
                    q.offer(entry);
                }
            }
        }
        int[] arr = new int[k];
        for(int i = 0; i<k;i++){
            arr[i] = q.poll().getKey();
        }
        return arr;
    }
}