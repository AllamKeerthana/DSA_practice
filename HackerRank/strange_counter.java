public class strange_counter {
    public static long strangeCounter(long t) {
    // Write your code here
        long cycle = 3;
        while(t>cycle){
            t-=cycle;
            cycle*=2;
        }
        
        return cycle-t+1;
    }
}
