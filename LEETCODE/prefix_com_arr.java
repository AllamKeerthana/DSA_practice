class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        // int[] ans = new int[A.length];
        // for(int i = 0;i<A.length;i++){
        //     ArrayList<Integer> temp = new ArrayList<>();
        //     for(int j= 0;j<=i;j++){
        //         temp.add(A[j]);
        //     }
        //     list1.add(temp);
        // }
        // for(int i = 0; i < B.length; i++){

        //     ArrayList<Integer> temp = new ArrayList<>();

        //     for(int j = 0; j <= i; j++){

        //         temp.add(B[j]);
        //     }

        //     list2.add(temp);
        // }
        
        // for(int i =0;i<A.length;i++){
        //     ArrayList<Integer> a = list1.get(i);
        //     ArrayList<Integer> b = list2.get(i);
        //     int count = 0;
        //     HashSet<Integer> temp = new HashSet<>(a);
        //     for(int num : b){
        //         if(temp.contains(num)) count++;
        //     }
        //     ans[i] = count;
        // }
        // return ans;
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        int[] ans = new int[A.length];
        int count = 0;

        for(int i = 0;i<A.length;i++){
            a.add(A[i]);
            b.add(B[i]);

            if(A[i]==B[i]) count++;
            else{
                if(b.contains(A[i])) count++;
                if(a.contains(B[i])) count++;
            }
            ans[i] = count;

        }
        return ans;
    }
}