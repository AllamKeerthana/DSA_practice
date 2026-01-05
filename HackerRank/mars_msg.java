public class mars_msg {
       public static int marsExploration(String s) {
    // Write your code here
        char o = 1;
        int count =0;
        int n = s.length();
        String str = "";
        int rep = n/3;
        for(int i = 0;i<rep;i++){
            str+="SOS";
        }
        for(int i = 0;i<n;i++){
            if(s.charAt(i)!=str.charAt(i)) count++;
        }
        return count;
    }

} 

