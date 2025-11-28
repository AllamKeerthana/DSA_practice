public class sum_pairs {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4,5,7,-1};
        int n = arr.length;
        int target = 6;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1; j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.print(count);
        
    }

}
