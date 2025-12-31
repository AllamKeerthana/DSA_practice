public class sq_sorted_arr {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int len = nums.length;
        int[] arr = new int[len];
        len = len-1;
        while(low<=high){
            if(Math.abs(nums[low])>Math.abs(nums[high])){
                arr[len]=nums[low]*nums[low];
                low++;
            }
            else{
                arr[len]=nums[high]*nums[high];
                high--;
            }
            len--;
        }
        return arr;
    }
}
