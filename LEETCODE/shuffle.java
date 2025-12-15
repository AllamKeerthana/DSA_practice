public class shuffle {
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a =0,b=n;
        int[] arr = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=nums[a];
                a++;
            }
            else{
                arr[i]=nums[b];
                b++;
            }
        }
        return arr;
    }
    }
}