public class keep_mul {

    public int findFinalValue(int[] nums, int original) {
        int n = nums.length, j =0;
        while(j<n){
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==original){
                original*= 2;
            }
            
        }
        j++;
    }
        return original;
    }

    // int i=0;
    //     while(i<nums.length){
    //         if(nums[i]==original){
    //             original = original*2;
    //             i=0;
    //         }else{
    //             i++;
    //         }
    //     }
    //     return original;
}
