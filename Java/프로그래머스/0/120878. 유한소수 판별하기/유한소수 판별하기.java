class Solution {
    static int gcd(int a, int b){
        int r=a%b;
        if(r==0){
            return b;
        }
        return gcd(b, r);
    }
    public int solution(int a, int b) {
        int gcd=gcd(a, b);
        b/=gcd;
        if(b==1){
            return 1;
        }
        while(b%2==0){
            b/=2;
        }
        while(b%5==0){
            b/=5;
        }
        if(b==1){
            return 1;
        }else{
            return 2;
        }
    }
}