class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=1000000; i++){
            if(Integer.bitCount(n)==Integer.bitCount(n+i))
                return n+i;
        }
        return answer;
    }
}