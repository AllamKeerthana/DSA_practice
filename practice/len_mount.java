import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();

        String[] s = str.split(" ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int max = 0;

        for(int i = 1; i < n - 1; i++) {

            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {

                int l = i;
                int h = i;

                while(l > 0 && arr[l - 1] < arr[l]) {
                    l--;
                }

                while(h < n - 1 && arr[h] > arr[h + 1]) {
                    h++;
                }

                max = Math.max(max, h - l + 1);
            }
        }

        System.out.print(max);
    }
}