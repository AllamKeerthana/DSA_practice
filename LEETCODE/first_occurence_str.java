public class first_occurence_str {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        if(n>h) return -1;
        if(n==h){
            if(needle.equals(haystack)) return 0;
        }
        for(int i = 0;i<h;i++){
            if(i+n<=h){
                if(haystack.substring(i,i+n).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}

