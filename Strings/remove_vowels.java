package Strings;

public class remove_vowels { 
        public static void main(String[] args) {
        String s = "This is an example";
        String vow = "aeiou";
        
        String ch = "";
        for(char c : s.toCharArray()){
            if(vow.indexOf(c)==-1) ch+=c;
        }
        System.out.println(ch);
    }
}
