import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        for(long a = 0; a * a <= n; a++) {

            long target = n - a * a;

            long l = 0;
            long h = target;

            while(l <= h) {

                long mid = l + (h - l) / 2;
                long sq = mid * mid;

                if(sq == target) {
                    System.out.print(true);
                    return;
                }
                else if(sq < target) {
                    l = mid + 1;
                }
                else {
                    h = mid - 1;
                }
            }
        }

        System.out.print(false);
    }
}