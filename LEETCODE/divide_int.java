public class divide_int {
    public int divide(int dividend, int divisor) {
        // int c = 0;
        // if(dividend==0||divisor==0) return 0;
        // if (divisor < 0) {
        //     divisor = Math.abs(divisor);
        //     while (dividend > 0) {
        //         dividend -= divisor;
        //         c++;
        //     }
        //     return -c+1;
        // }
        // while (dividend > 0) {
        //     dividend -= divisor;
        //     c++;
        // }
        // return c-1;
        int c = 0;
        if(dividend==Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MAX_VALUE && divisor == -1){
            return -Integer.MAX_VALUE;
        }

        boolean neg = (dividend<0)^(divisor<0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        while(a>=b){
            a-=b;
            c++;
        }

        return neg ? -c : c;

    }
}
