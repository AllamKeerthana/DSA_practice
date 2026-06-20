import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            activities[i][0] = sc.nextInt(); // start
            activities[i][1] = sc.nextInt(); // end
        }

        Arrays.sort(activities, (a, b) -> a[1] - b[1]);

        int count = 1;
        int end = activities[0][1];

        for (int i = 1; i < n; i++) {
            int curr = activities[i][0];

            if (curr >= end) {
                count++;
                end = activities[i][1];
            }
        }

        System.out.println(count);
    }
}