import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        bubble(arr);
        System.out.println("Sorted array (bubble sort): " + Arrays.toString(arr));
        selection(arr);
        System.out.println("Sorted array (selection sort): " + Arrays.toString(arr));
        insertion(arr);
        System.out.println("Sorted array (insertion sort): " + Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean yes;
        for(int i =0;i<arr.length;i++){
            yes = false;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    yes = true;

                }
            }
            if(!yes) break;
        }
    }

    static void selection(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int min = i;
            for(int j =i+1;j < arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp =  arr[i];
            arr[i] = arr[min];
            arr[min]= temp;;
        }
    }

    static void insertion(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }
}