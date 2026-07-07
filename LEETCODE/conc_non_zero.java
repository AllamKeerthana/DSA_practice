class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long y = 0;
        long sum = 0;
        while(n>0){
            long rem = n%10;
            if(rem!=0){
                x=x*10+rem;
            }
            n/=10;
        }

        while(x>0){
            long rem = x%10;
            y=y*10+rem;
            x/=10;
            sum+=rem;
        }

        return y*sum;
    }
}