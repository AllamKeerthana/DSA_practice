import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] activities = new int[n][2];

        int maxday = 1;

        for(int i = 0; i < n; i++) {

            sc.next(); // read and ignore a,b,c,d...

            activities[i][0] = sc.nextInt(); // deadline
            activities[i][1] = sc.nextInt(); // profit

            maxday = Math.max(maxday, activities[i][0]);
        }

        Arrays.sort(activities, (a, b) -> b[1] - a[1]);

        boolean[] slot = new boolean[maxday + 1];

        int count = 0;
        int profit = 0;

        for(int i = 0; i < n; i++) {

            int deadline = activities[i][0];

            for(int day = deadline; day >= 1; day--) {

                if(!slot[day]) {

                    slot[day] = true;

                    count++;

                    profit += activities[i][1];

                    break;
                }
            }
        }

        System.out.print(count + " " + profit);
    }
}