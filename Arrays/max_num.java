import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("elements in the array");
        for(int i : arr){
            System.out.println(i);
        }

        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        System.out.println("the max of the arr: " + max);
    }
}
