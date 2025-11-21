public class reverse_num {
    public static void main(String[] args) {
        int n = 1234;
        int count = 0;
        int rem;
        
        while(n>0){
            rem = n%10;
            n/=10;
            count = count*10+rem;
        }
        System.out.println(count);
    }
}
