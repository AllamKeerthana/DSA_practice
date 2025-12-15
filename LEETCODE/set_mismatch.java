class set_mismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int[] freq = new int[nums.length]; 
        int count = 0;
        for(int i : nums){
            freq[i-1]++;
        }

        for(int val =0 ;val<nums.length;val++){
            if(freq[val]==2) arr[0]=val+1;
            if(freq[val]==0) arr[1]=val+1;
        }

        return arr;
    }
}