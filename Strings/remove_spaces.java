public class remove_spaces {
    public static void main(String[] args) {
        String s = "i am all right";
        String ch = "";
        for(char c : s.toCharArray()){
            if(c != ' ') ch+=c;
        }
        System.out.println(ch);
    }
}