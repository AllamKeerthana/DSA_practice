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
        int[] merged = mergesort(arr);
        System.out.println("Sorted array (merge sort): " + Arrays.toString(merged));
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

    static int[] mergesort(int[] arr){
        if(arr.length==1) return arr;

        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }

    static int[] merge(int[] left, int[] right){
        int[] ans  = new int[left.length+right.length];
        int i = 0, j = 0, k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
                k++;
            }
            else{
                ans[k] = right[j];
                j++;
                k++;
            }
        }

        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}