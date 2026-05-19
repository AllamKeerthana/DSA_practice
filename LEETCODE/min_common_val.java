class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // int one = 0;
        // int two = 0;
        // while(one<nums1.length && two<nums2.length){
        //     int count = two+1;
        //     if(nums1[one]==nums2[two]){
        //         return nums1[one];
        //     }
            
        //     else{
        //         for(int i = count;i<nums2.length;i++){
        //             if(nums1[one]==nums2[i]) return nums1[one];
        //         }
        //         one++;
        //     }
        // }
        // return -1;
        // HashSet<Integer> set1 = new HashSet<>();
        // HashSet<Integer> set2 = new HashSet<>();
        // for(int num: nums1){
        //     set1.add(num);
        // }
        // for(int num : nums2){
        //     set2.add(num);
        // }

        // for(int num : nums1){
        //     if(set2.contains(num)){
        //         return num;
        //     }
        // }
        // return -1;

        int i = 0, j = 0, len1 = nums1.length, len2 = nums2.length;
        if(nums1[len1-1]<nums2[0] || nums2[len2-1]<nums1[0]) return -1;

        while(i<len1 && j<len2){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}