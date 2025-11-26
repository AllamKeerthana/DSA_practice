public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        for(int i =0;i<5;i++){
            for(int j=i;j<5;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int n : arr){
            System.out.print(n);
        }
    }
}