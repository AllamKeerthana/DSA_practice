class Solution {
    public int[] resultArray(int[] nums) {
        int[] a1 = new int[nums.length];
        int[] a2 = new int[nums.length];
        a1[0] = nums[0];
        a2[0] = nums[1];
        int a = nums[0];
        int b = nums[1];
        int c = 1 , d =1;
        for(int i = 2;i<nums.length;i++){
            if(a>b){
                a1[c++] = nums[i];
                a = nums[i];
            }

            else{
                a2[d++] = nums[i];
                b = nums[i];
            }
        }
        int[] arr = new int[nums.length];
        int x = 0;
        for(int i =0;i<c;i++){
            arr[x++] = a1[i];
        }
        for(int i=0;i<d;i++){
            arr[x++] = a2[i];
        }
        return arr;
    }
}