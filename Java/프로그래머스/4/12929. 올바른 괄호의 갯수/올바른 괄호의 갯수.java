class Solution {
    public long solution(int n) {
        long answer=1;
        for(int i=2*n; i>n+1; i--){
            answer*=i;
        }
        for(int i=n; i>1; i--){
            answer/=i;
        }
        return answer;
    }
}