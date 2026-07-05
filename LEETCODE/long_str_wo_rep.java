class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen = new int[128];
        Arrays.fill(seen,-1);
        int l = 0, max = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(seen[ch]>=l){
                l=seen[ch]+1;
            }
            seen[ch]=i;
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}