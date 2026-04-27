class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain=0;
        while((remain+n)/a!=0){
            answer+=n/a*b;
            n=n-(n-n%a)+n/a*b;
        }
        return answer;
    }
}