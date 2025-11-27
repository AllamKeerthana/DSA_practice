public class remove_dupli{    
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,2,3,5};
        // int n = arr.length;
        // for(int i =0;i<n;i++){
        //     boolean dup = false;
        //     for(int j = 0;j<i;j++){
        //         if(arr[i]==arr[j]){
        //             dup = true;
        //             break;
        //         }
        //     }
        //     if(!dup) System.out.println(arr[i]);
        // }

        // optimal - hashset
        int[] arr = {1,2,3,4,2,3,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i  = 0; i<arr.length;i++){
            if(!set.contains(arr[i])){
                System.out.println(arr[i]);
                set.add(arr[i]);    
            }
        }
    }
}
