import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        
        System.out.println(arms(153));
    }
    
    public static boolean arms(int n1){
    int n = n1;
    int og = n1;
    int digits = 0;

    
    while(n > 0){
        digits++;
        n /= 10;
    }

    n = n1;  

    // this is more optimized approach coz if we use arraylist it will take more time and space
    int total = 0;
    while(n > 0){
        int r = n % 10;
        total += (int)Math.pow(r, digits);
        n /= 10;
    }

    return total == og;
}

   
}
    
    

