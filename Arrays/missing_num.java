public class missing_num {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4,5};
        int n = arr.length +1;
        int sum = 0 ;
        for(int i = 0;i<n-1;i++){
            sum+=arr[i];
        }
        
        int total = n*(n+1)/2;
        int miss = total - sum;

            System.out.print(miss+ " ");
        
    }

}
