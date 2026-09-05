class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //     HashMap<Integer,Integer> map = new HashMap<>();
        //     for(int i = 0;i<nums.length;i++){
        //         if(!map.containsKey(nums[i])){
        //             map.put(nums[i],1);
        //         }
        //         else{
        //             map.put(nums[i],map.get(nums[i])+1);
        //         }
        //     }
        //     PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //         if(q.size()<k){
        //             q.offer(entry);
        //         }
        //         else{
        //             if(entry.getValue()>q.peek().getValue()){
        //                 q.poll();
        //                 q.offer(entry);
        //             }
        //         }
        //     }
        //     int[] arr = new int[k];
        //     for(int i = 0; i<k;i++){
        //         arr[i] = q.poll().getKey();
        //     }
        //     return arr;
        // }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] count = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int freq = entry.getValue();

            if (count[freq] == null) {
                count[freq] = new ArrayList<>();
            }

            count[freq].add(entry.getKey());
        }

        int[] arr = new int[k];
        int c = 0;

        for (int i = nums.length; i > 0; i--) {

            if (count[i] != null) {

                for (int num : count[i]) {
                    arr[c++] = num;

                    if (c == k) {
                        return arr;
                    }
                }
            }
        }

        return arr;
    }
}