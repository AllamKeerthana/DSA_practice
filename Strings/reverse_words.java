public class reverse_words{
    public static void main(String[] args){
        String s = "i am not so good";
        String[] words = s.split(" ");

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
        // for(char ch:s.toCharArray()){
        //     if(ch != ' ') current+=ch;
        //     else{
        //         for(int i = current.length()-1;i>=0;i--){
        //             System.out.print(current.charAt(i));
        //         }
        //         current = "";
        //     }
        //     System.out.print(" ");
            
        // }
        // // Print last word (most important fix)
        // for (int i = current.length() - 1; i >= 0; i--) {
        //     System.out.print(current.charAt(i));
        // }

    }
}