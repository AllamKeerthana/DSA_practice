public class rotation_arr {

    public static void main(String[] args) {
        int k = 6;
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] rot_arr = new int[n];
        if(k>n) k = k%n;
        if(k<n){
        for(int i = k; i<n;i++){
            rot_arr[i-k]=arr[i];
        }
        for(int i = 0; i<k;i++){
            rot_arr[n-k+i]=arr[i];
        }
        }
        
        for(int i : rot_arr){
            System.out.print(i+" ");
        }
    }
}
