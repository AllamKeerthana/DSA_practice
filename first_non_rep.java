public class first_non_rep{
    public static void main(String[] args){
        String s = "swiss";
        int[] freq = new int[256];

        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        for(char ch: s.toCharArray()){
            if(freq[ch]==1) {System.out.println(ch);
                return;
            }
        }
    }
}