// first try this was what i came up with but later found a better to optimize that 
// class Solution {
//     public int[] separateDigits(int[] nums) {
//         ArrayList<Integer> doop = new ArrayList<>();
//         for(int i : nums){
            
//             String s = String.valueOf(i);
//             for(int j = 0;j<s.length();j++){
//                 doop.add(s.charAt(j)-'0');
//             }
//         }
//         int[] ans = new int[doop.size()];
//         for(int i = 0;i<doop.size();i++){
//             ans[i]=doop.get(i);
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] separateDigits(int[] nums) {
        int total = 0;
        for(int n : nums){
            int temp = n;
            if(temp == 0){
                total++;
            }
            else{
                while(temp>0){
                    total++;
                    temp/=10;
                }
            }
        }

        int[] ans = new int[total];
        int yup = total -1;
        for(int i = nums.length-1; i>=0;i--){

            int num = nums[i];
            if(num==0){
                ans[yup--] = num;
            }
            else{
                while(num>0){
                    ans[yup--] = num % 10;
                    num/=10;
                }
            }
            
        }
        return ans;
    }
}