public class count_digits {
    public static void main(String[] args) {
       int n = 1234;
        int count = 0;
        int rem;
        
        while(n>0){
            rem = n%10;
            n/=10;
            count++;
        }
        System.out.println(count); 
    }
}
