class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char ch : text.toCharArray()){
            freq[ch-'a']++;
        }
        int c = Integer.MAX_VALUE;
        c = Math.min(freq[1],c);
        c = Math.min(freq[0],c);
        c = Math.min(freq['l'-'a']/2,c);
        c = Math.min(freq[14]/2,c);
        c = Math.min(freq[13],c);
        return c;

    }
}