class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n; // simple maths behind this it is like the sum of odd num is n*n and sum of even number is always n(n+1); then gcd(n*n,n(n+1))..
        //then if we take the n common out we get n*gcd(n,n+1), so anytime the consecutive number are coprimes so their gcd is 1 and then n*1 is "n"
    }
}