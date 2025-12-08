public class count_triplets {

    public int countTriples(int n) {
        int result=0;
        for(int i = 1; i<n;i++){
            for(int j =1;j<n;j++){
                int target = i*i + j*j;
                int c =(int) Math.sqrt(target);
                if(c<=n && c*c ==target) result+=1;
            }
        }
        return result;
    }

}
