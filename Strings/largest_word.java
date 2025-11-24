

public class largest_word {
    public static void main(String[] args) {
        String s = "This is an example";
        String[] words = s.split(" ");
        String l = "";
        for(int i =0;i<words.length;i++){
            if(words[i].length()>l.length()) l = words[i];
        }
        System.out.println(l);
    }
}