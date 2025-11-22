public class factors{
    public static void main(String[] args){
        div(25);
    }
    
    public static void div(int n){
        for(int i=1;i<= Math.sqrt(n)+1;i++){
            if(n%i==0) {
                System.out.println(i);
                    if(i!=n/i) System.out.println(n/i);}
        }
    }
}