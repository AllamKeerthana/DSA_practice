import java.util.Scanner;
public class panagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(char ch : s.toCharArray()){
            if(ch>='a'&&ch<='z'){
            if(str.indexOf(ch)==-1) str+=ch;
        }
    }
        int n = str.length();
        if(n==26) System.out.println("it is a panagram");
        else System.out.println("it is not a panagram");
        

    }
}
