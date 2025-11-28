public class com_two_arr {
    public static void main(String[] args) {
        int[] arr1 = {1,0,2,3,0,4,0};
        int[] arr2 = {1,3,4,5,6,7,9,1};
        int n = arr1.length;
        int m = arr2.length;
        boolean dup = false;
        for(int i = 0;i<n;i++){
                for(int k = 0;k<i;k++){
                    if(arr1[k]==arr1[i]){
                        dup = true;
                        break;
                    }
                    
                    if(dup) continue;
                }
                for(int j = 0 ;j<m;j++){
                    if(arr1[i]==arr2[j]){
                        System.out.println(arr1[i]);
                        break;
                    }   
                }
        }
    }
}

