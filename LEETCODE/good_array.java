class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(nums[i]!=n-1) return false;
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int i = 1;i<n-1;i++){
            if(map.containsKey(i) && map.get(i)!=2) continue;
            else return false;
        }
        if(map.containsKey(n-1) && map.get(n-1)==2) return true;
        else return false;


    }
}