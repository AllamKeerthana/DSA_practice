public class mirror_dist_int {

    public int mirrorDistance(int n) {
        int sum =0,r=0,original = n;
        while(n>0){
            r = n%10;
            sum=sum*10+r;
            n/=10;
        }

        return Math.abs(original-sum);
    }
}
