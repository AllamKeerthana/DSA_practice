class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int alt = 0;
        for(int num : gain){
            alt+=num;
            if(max<alt) max = alt;
        }
        return (max>0)? max : 0;
    }
}