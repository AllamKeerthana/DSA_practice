public class rev_same_vowel_count {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        int prev = 0;
        for(char ch : words[0].toCharArray()){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    prev++;
                }
            }
        for(int i=1;i<words.length;i++){
            int count = 0;
            for(char ch : words[i].toCharArray()){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }
            }
            
            if(prev ==count){
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        
        }

        return String.join(" ",words);
    }
}
