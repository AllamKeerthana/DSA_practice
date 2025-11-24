public class remove_digits{
    public static void main(String[] args){
        String n = "";
        String s = "Allam12Keerthana18chowdary";
        
        
        
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)) n+=ch ;
        }
        
        System.out.println(n);
    }
}