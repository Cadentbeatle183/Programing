class Solution {
    public int[] solution(int n, int m) {
        if(n>m){
            int temp=n;
            n=m;
            m=temp;
        }
        int gcd=0;
        int x=n;
        int y=m;
        while(gcd!=1){
            if(x%y==0)
                break;
            gcd=x%y;
            x=y;
            y=gcd;
        }
        return new int[]{gcd, n*m/gcd};
    }
}