public class count_vowels{
    public static void main(String[] args){
        int n = 0;
        String s = "Allam Keerthana chowdary";
        s = s.toLowerCase();
        String vow = "aeiou";
        
        for(char ch : s.toCharArray()){
            if(vow.indexOf(ch)!=-1) n++;
        }
        
        System.out.println(n);
    }
}