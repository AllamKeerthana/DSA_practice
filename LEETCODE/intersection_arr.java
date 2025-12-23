public class intersection_arr {

    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        List<Integer> ans = new ArrayList<>();
       int i=0,j=0;
       while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }

            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
       }

        int[] arr = new int[ans.size()];
        int a=0;
        for(int x : ans){
            arr[a] = x;
            a++;
        }
        return arr;
    }
}

// import java.util.*;

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {

//         // Step 1: Count frequency of nums1
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int x : nums1) {
//             map.put(x, map.getOrDefault(x, 0) + 1);
//         }

//         // Step 2: Find intersection using nums2
//         List<Integer> result = new ArrayList<>();

//         for (int x : nums2) {
//             if (map.containsKey(x) && map.get(x) > 0) {
//                 result.add(x);
//                 map.put(x, map.get(x) - 1); // decrease count ONLY here
//             }
//         }

//         // Step 3: Convert list to array
//         int[] ans = new int[result.size()];
//         for (int i = 0; i < result.size(); i++) {
//             ans[i] = result.get(i);
//         }

//         return ans;
//     }
// }

