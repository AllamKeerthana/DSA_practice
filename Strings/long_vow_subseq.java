public class long_vow_subseq {
    
    public static void main(String[] args) {
        String vow = "aeiou";
        String b = "hello aeiral";
        String current = "";
        String longest = "";
        
        for(char ch: b.toCharArray()){
            if(vow.indexOf(ch)!=-1){
                current+=ch;
            }
            else{
                if(current.length()>longest.length()){
                    longest = current;
                }
                current = "";
            }
        }
        System.out.println(longest);
        
    }
}

