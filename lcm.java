public class lcm {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 12;
        
        int result = Lcm(n1,n2);
        System.out.println(result);
    }
     public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int Lcm(int n1, int n2){
         return (n1 * n2) / gcd(n1, n2);
    }

}
