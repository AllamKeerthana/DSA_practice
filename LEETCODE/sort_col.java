public class sort_col {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];

        for(int num : nums){
            freq[num]++;
        }

        int count = 0;

        for(int i =0 ; i<3;i++){
            while(freq[i]>0){
                nums[count++] = i;
                freq[i]--;
            }
        }
    }
}
