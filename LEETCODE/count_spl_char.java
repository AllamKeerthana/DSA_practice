class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] low = new boolean[26];
        boolean[] high = new boolean[26];
        int count =0;
       for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
            low[ch-'a'] = true;
            }
            else{
                ch = Character.toLowerCase(ch);
                high[ch-'a']=true;
            }
       } 
       
       for(int i = 0;i<=25;i++){
        if(low[i]==true && high[i]==true){
            count++;
        }
       }
       return count;
    }
}