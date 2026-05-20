class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        // for(int i =0;i<n;i++){
        //     for(int j = i;j<n;j++){
        //         String temp = s.substring(i,j+1);
        //         int len = temp.length();
        //         int low = 0, high = len-1;
        //         boolean flag = true;
        //         while(low<high){
        //             if(temp.charAt(low)!=temp.charAt(high)){
        //                 flag = false;
        //                 break;

        //             }
        //             low++;
        //             high--;
                    
        //         }
        //         if(flag) count++;
        //     }
        // }
        // return count;
        for(int i = 0;i<n;i++){
            
            int low=i;
            int high = i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                count++;
                low--;
                high++;
            }
            low = i;
            high = i+1;
            while(low>=0&&high<n && s.charAt(low)==s.charAt(high)){
                count++;
                low--;
                high++;
            }
        }
        return count;
    }
}