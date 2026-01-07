    public static int palindromeIndex(String s) {
    // Write your code here
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            
            else{
                if(isPalin(s,left+1,right)){
                    return left;
                }
                if(isPalin(s,left,right-1)){
                    return right;
                }
                return -1;
                    
                
            }
        }
        return -1;
    }
    private static boolean isPalin(String s, int l, int r) {
    while (l < r) {
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        l++;
        r--;
    }
    return true;
}

}