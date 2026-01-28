public class happy_number {

    public boolean isHappy(int n) {
    //    HashSet<Integer> ans = new HashSet<>();
    //    while(n!=1 && !ans.contains(n)){
    //     ans.add(n);

    //     int sum =0;
    //     while(n>0){
    //         int digit = n%10;
    //         sum+=digit*digit;
    //         n/=10;
    //     }
    //     n=sum;
    //    }
    //    return n==1;
    int fast = n, slow = n;
    do{
        slow = findSq(slow);
        fast = findSq(findSq(fast));
    }while(slow!=fast);

    if(slow==1) return true;

    return false;
       
    }
    private int findSq(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
       
}
