class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length-k+1];
        List<Integer> l = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<k;i++){
            l.add(nums[i]);
            max = Math.max(max,nums[i]);
        }
        int a = 0;
        arr[a++] = max;
        for(int i = k;i<nums.length;i++){
            l.remove(0);
            l.add(nums[i]);
            int m = l.get(0);
            for(int j = 1; j<k;j++){
                m = Math.max(m,l.get(j));
            }
            arr[a++] = m;

        }

        return arr;
    }
}