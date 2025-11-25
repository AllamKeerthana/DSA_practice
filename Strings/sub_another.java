

class sub_another{ 
    public static void main(String[] args) {
        String a = "abcde";
        String b = "abcgfhdkle";
        int i =0;
        int j = 0;
        
        while(i<a.length()&&j<b.length()){
            if(a.charAt(i)==b.charAt(j)){ 
                i++;}
                
            j++;
        }
        
        if(i==a.length()) System.out.println("a is a subsequence of b");
    }
} 
