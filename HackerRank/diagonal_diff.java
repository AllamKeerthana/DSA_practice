public class diagonal_diff {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int d1=0, d2=0;
        for(int i = 0;i<arr.get(0).size();i++){
            for(int j = 0; j<arr.size();j++){
                if(i==j) d1+=arr.get(i).get(j);
                if( i + j == arr.size()-1) d2+=arr.get(i).get(j);
            }
        }
        
        return Math.abs(d1-d2);
    }

}