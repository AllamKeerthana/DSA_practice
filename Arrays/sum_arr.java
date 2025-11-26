
    import java.util.Scanner;

public class sum_arr {
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
        int sum =0;
        for(int i:arr){
            sum+=i;
            }
        
        
        System.out.println("sum of the arr:"+sum);
        
    }
}

}
