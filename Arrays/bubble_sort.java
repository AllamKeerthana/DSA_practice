package Arrays;

public class bubble_sort {
     public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        for(int i =0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int n : arr){
            System.out.print(n);
        }
    }
}
