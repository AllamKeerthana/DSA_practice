package Strings;

public class palindrome {
    public static void main(String[] args) {
    String s = "dad";
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if (s.equals(rev)) System.out.println("this is a palindrome");
        else System.out.println("this is not a palindrome");
    }
}
