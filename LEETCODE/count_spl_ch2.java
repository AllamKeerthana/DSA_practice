class Solution {
    public int numberOfSpecialChars(String word) {
        int[] l = new int[26];
        int[] u = new int[26];
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                l[ch-'a'] = i+1;
            }
            else{
                
                if(u[ch-'A']==0){
                    u[ch-'A']=i+1;
                }
            }
        }
        int count = 0;
        for(int i = 0;i<26;i++){
            if(l[i]!=0 && u[i]!=0){
                if(l[i]<u[i]){
                    count++;
                }
            }
        }
        return count;
    }
}