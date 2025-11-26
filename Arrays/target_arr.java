
    import java.util.Scanner;
public class target_arr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arr:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("elements in the array");
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("enter the target value:");
        int target = sc.nextInt();
        boolean ans = false;
        for(int i : arr){
            if(i==target){ 
                ans = true;
                break;
            }
        }
        System.out.println(ans);
        
        
    }
}

}
