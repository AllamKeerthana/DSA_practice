class Solution {
    public boolean consecutiveSetBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int r = n%2;
            sb.append(r);
            n/=2;
        }
        sb = sb.reverse();

        int count = 0;
        for(int i = 0; i<sb.length()-1;i++){
            if(count>1) return false;
            if(sb.charAt(i)=='1'&&sb.charAt(i+1)=='1') count++;
        }
        return (count==1);
    }
}