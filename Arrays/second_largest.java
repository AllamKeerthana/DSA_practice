// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arr:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the arr:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int max = arr[0];
        int min = 0 ;
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                min = max;
                max = arr[i];
            }
            else if(arr[i] > min && arr[i] != max){
                min = arr[i];
            }
        }
        
        System.out.println("second largest no: "+min);
    }
}