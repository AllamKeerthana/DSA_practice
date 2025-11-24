package Strings;

public class count_unq_vowels {
    public static void main(String[] args) {
        String s = "Allam Keerthana chowdary";
        s = s.toLowerCase();
        String vow = "aeiou";
        int count =0;

        for(char ch : vow.toCharArray()){
            if(s.indexOf(ch)!=-1) count++;
        }

        System.out.println(count);
    }
}
