class Solution {
    // static int fibonacciSequence(int n){
    //     if(n<=1)
    //         return n;
    //     return fibonacciSequence(n-1)+fibonacciSequence(n-2);
    // }
    public int solution(int n) {
        long x=0L,y=0L,z=1L;
        for(int i=2; i<=n; i++){
            x=(y+z)%1234567L;
            y=z;
            z=x;
        }
        return (int)x;
    }
}