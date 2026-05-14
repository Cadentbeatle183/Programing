class Solution {
    int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator=numer1*denom2+numer2*denom1;
        int denominator=denom1*denom2;
        int gcd =numerator > denominator ? gcd(numerator , denominator) : gcd(denominator , numerator);
        return new int[]{numerator/gcd, denominator/gcd};
    }
}