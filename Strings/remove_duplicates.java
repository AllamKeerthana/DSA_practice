class remove_duplicates{
    public static void main(String[] args) {
        String s = "i am all right";
        String l = "";
        for(char ch : s.toCharArray()){
            if(ch!=' ' && l.indexOf(ch)==-1) l+=ch;
        }
        System.out.println(l);
    }
}