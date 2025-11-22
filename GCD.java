
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(24,36));
    }
    public static int gcd(int n1, int n2){
        int small = 0;
        if(n1>n2) small = n2;
        else small = n1;
        int gc = 0;
        
        for(int i = 1;i<=small;i++){
            if(n1%i==0 && n2%i==0) gc = i;
        }
        return gc;
    }
}
    
    