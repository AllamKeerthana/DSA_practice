class Solution {
    public int smallestNumber(int n, int t) {
        int max=0;
        for(int i = n;i<n+10;i++){
            int pro = 1;
            int num = i;
            while(num>0){
                int rem = num%10;
                pro*=rem;
                num/=10;
            }
            if(pro%t==0){
                max = i;
                break;
            }
        }
        return max;
    }
}