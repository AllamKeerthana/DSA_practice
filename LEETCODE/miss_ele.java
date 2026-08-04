class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        for (int i = min; i < max; i++) {
            if (!set.contains(i))
                arr.add(i);
        }
        return arr;
    }
}