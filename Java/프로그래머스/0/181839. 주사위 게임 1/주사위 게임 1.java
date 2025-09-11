class Solution {
    public int solution(int a, int b) {
        if((a*b)%2==1)
            return a*a+b*b;
        else if((a+b)%2==1)
            return 2*(a+b);
        else 
            return a>b?a-b:~(a-b)+1;
    }
}