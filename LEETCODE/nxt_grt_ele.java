class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        int n = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums2[n-1],-1);
        s.add(nums2[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        int j = 0;
        for(int num : nums1){
            arr[j++] = map.get(num);
        }
        return arr;
    }
}