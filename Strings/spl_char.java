class spl_char{
    public static void main(String[] args) {
        String s = "i @am !all right";
        int ch = 0;
        for(char c : s.toCharArray()){
            if(!Character.isLetter(c) && !Character.isDigit(c) && c != ' ') ch++; 
        }
        System.out.println(ch);
    }
}