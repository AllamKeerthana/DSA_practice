// class Solution {
//     public int minMoves(int[] nums, int limit) {
//         int st = 2, end = 2*limit;
//         int count = Integer.MAX_VALUE;
//         int n = nums.length;
//         while(st<=end){
//             int target = st;
//             int max = 0;
//             for(int i = 0; i<n/2;i++){
//                 int x = nums[i], y = nums[n-i-1];

//                 int a = nums[i]+nums[n-i-1];
//                 if(a == target) continue;
                
//                 else if (((target-x) >=1 && (target-x)<=limit) || ((target-y)>=1 && (target-y)<=limit)){
//                  max++;   
//                 }
//                 else max +=2;
//             }
//             count = Math.min(count,max);
//             st++;
//         }
//         return count;
//     }
// }
class Solution {
    public int minMoves(int[] nums, int limit) {

        int n = nums.length;
        int[] diff = new int[2 * limit + 2];

        for (int i = 0; i < n / 2; i++) {

            int a = nums[i];
            int b = nums[n - 1 - i];

            int low = 1 + Math.min(a, b);
            int high = limit + Math.max(a, b);

            int sum = a + b;

            diff[2] += 2;
            diff[2 * limit + 1] -= 2;

            diff[low] -= 1;
            diff[high + 1] += 1;

            diff[sum] -= 1;
            diff[sum + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;
        int current = 0;

        for (int target = 2; target <= 2 * limit; target++) {

            current += diff[target];

            ans = Math.min(ans, current);
        }

        return ans;
    }
}