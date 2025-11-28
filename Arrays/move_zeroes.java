public class move_zeroes {

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 0, 5};
        int n = arr.length;
        int j =0 ;
        for(int i = 0 ;i <n;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        
        while(j<n){
            arr[j] = 0;
            j++;
            }
        
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}

