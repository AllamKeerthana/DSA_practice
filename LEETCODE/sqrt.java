public class sqrt {

    public int mySqrt(int x) {
        int i =1;
        if(x==0) return 0;
        if(x<=3) return 1;
        while(i<(x/2)+1 && i<=x/i){
            i++;
        }
        if(i*i==x) return i;
        else return i-1;

        // but this is not optimal this takes a lot of time for large numbers
        // optimal way is binary search
        
    }

}
