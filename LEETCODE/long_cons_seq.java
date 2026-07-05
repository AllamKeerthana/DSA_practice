class Solution {
    public int longestConsecutive(int[] nums) {
       int len = 1, max = 1;
       if(nums.length==0) return 0;
    //    Arrays.sort(nums);
    //    for(int i = 0;i<nums.length-1;i++){
    //     if(nums[i]==nums[i+1]-1){
    //         len++;
    //         max = Math.max(max,len);
    //     }
    //     else if(nums[i]==nums[i+1]) continue;
    //     else{
    //         max = Math.max(max,len);
    //         len = 1;
    //     }

    //    }
    //    return max; 

    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
        set.add(num);
    }
    for(int num : nums){
        if(!set.contains(num-1)){
            int curr = num;
            len = 1;
            while(set.contains(curr+1)){
                len++;
                curr++;
            }
            max = Math.max(max,len);
        }
    }
    return max;
    }
}