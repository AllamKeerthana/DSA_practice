public class binary_search {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int l = 0, r = arr.length, mid = 0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
            
            if(arr[mid]>target){
                r = mid-1;
            }
            
            if(arr[mid]<target){
                l=mid+1;
            }
        }
        
        return;
    }
}
