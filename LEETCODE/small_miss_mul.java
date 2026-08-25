class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> arr = new ArrayList<>();
        for( int i : nums){
            arr.add(i);
        }
        int x = k;
        int c = 1;
        int num = k*k;
        while(true){

            if(!arr.contains(x)){
                return x;
            }
            c++;
            x=k*c;
        }
        

    }
}