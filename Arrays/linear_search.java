public class linear_search {
    int index(int[] arr, int target){
           for(int i =0;i<arr.length;i++){
               if(arr[i]==target) return i;
           } 
           return -1;
        }
    
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5,3};
        int target = 8;
        linear_search obj = new linear_search();
        int result = obj.index(arr,target);
        System.out.println(result);
}
}
