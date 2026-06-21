class Solution {
    public int maxDistance(String moves) {

        int l = 0, r = 0, u = 0, d = 0, blank = 0;

        for(char ch : moves.toCharArray()) {
            if(ch == 'L') l++;
            else if(ch == 'R') r++;
            else if(ch == 'U') u++;
            else if(ch == 'D') d++;
            else blank++;
        }

        return Math.abs(r - l) + Math.abs(u - d) + blank;
    }
}