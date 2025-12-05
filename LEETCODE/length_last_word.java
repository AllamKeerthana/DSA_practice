public class length_last_word {

    public int lengthOfLastWord(String s) {
        // String[] str = s.split(" ");
        // return str[str.length -1].length();
        int i = s.length()-1;
        while(s.charAt(i) == ' '){
            i--;
        }
        int count = 0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}


