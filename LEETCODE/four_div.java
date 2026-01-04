public class four_div {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for (int a : nums) {
            int c = 0;
            int sum = 0;

            for (int j = 1; j * j <= a; j++) {
                if (a % j == 0) {
                    c++;
                    sum += j;

                    if (j != a / j) {
                        c++;
                        sum += a/j;
                    }
                    if (c > 4) {
                        break;
                    }

                }

            }

            if (c == 4) {
                total += sum;
            }

        }
        return total;
    }
}
