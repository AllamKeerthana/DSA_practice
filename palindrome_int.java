class palindrome_int {
    public static void main(String[] args) {
        int n = 121;
        int o = 121;
        int sum = 0;
        int rem;
        while(n>0){
            rem = n%10;
            n/=10;
            sum = sum*10+rem;
        }
        if(o==sum) System.out.println("the given number is palindrome");
        else System.out.println("the given number is not palindrome");
    }
}