class rev_word_str {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int n = str.length;
        String ha = "";
        for(int i = n-1;i>=0;i--){
            if(i>0) ha+=str[i] + " ";
            else ha+=str[i];
        }
        return ha;
    }
}