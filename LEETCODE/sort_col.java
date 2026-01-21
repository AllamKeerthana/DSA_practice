public class sort_col {
    public void sortColors(int[] nums) {
        // int[] freq = new int[3];

        // for(int num : nums){
        //     freq[num]++;
        // }

        // int count = 0;

        // for(int i =0 ; i<3;i++){
        //     while(freq[i]>0){
        //         nums[count++] = i;
        //         freq[i]--;
        //     }
        // }
        int left = 0, mid = 0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            }

            else if(nums[mid]==2){
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid] = temp;
                high--;
            }

            else{
                mid++;
            }
        }

    }
}
