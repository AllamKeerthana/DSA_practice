public class angry_prof {
   public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        int yes = 0;
        int no =0;
        for(int i : a){
            if(i>0) no++;
            else yes++;
        }
        return(yes>=k) ? "NO" : "YES";
    }

}
