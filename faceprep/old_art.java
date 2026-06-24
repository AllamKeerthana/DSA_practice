import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
        String[] s = str.split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int l = 0;
        int h = n - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] > arr[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }

        System.out.println(arr[l]);
    }
}