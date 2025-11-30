public class max_consec_ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int longs = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                current++;
                longs = Math.max(current, longs);
            } else {
                current = 0;
            }
        }

        return longs;
    }

    public static void main(String[] args){
        int[] arr = { 1,0,1,1,0,1,1,0,1,1,1};
        max_consec_ones obj = new max_consec_ones();
        int result = obj.findMaxConsecutiveOnes(arr);
        System.out.println(result);

    }
}


