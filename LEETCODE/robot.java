class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int up = 0, side = 0;
        for(int i =0;i<n;i++){
            if(moves.charAt(i)=='U') up+=1;
            else if(moves.charAt(i)=='D') up-=1;
            else if(moves.charAt(i)=='R') side+=1;
            else if(moves.charAt(i)=='L') side-=1;
            else return false;
        }
        boolean ans = false;
        if(up==0 && side ==0) ans = true;
        return ans;
    }
}