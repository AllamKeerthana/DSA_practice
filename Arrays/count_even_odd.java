
    import java.util.Scanner;

public class count_even_odd {
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
        int even = 0;
        int odd = 0;
        for(int i:arr){
            if(i%2==0){
                even++;
            }
            else odd++;
        }
        
        System.out.println("no of even num in the arr:"+even);
        System.out.println("no of odd num in the arr:"+odd);
    }
}

}
