public class n_rep_ele_arr {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0 ;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > 1) {
                ans = num;
                break;
            }
        }
        return ans;

    }
}
