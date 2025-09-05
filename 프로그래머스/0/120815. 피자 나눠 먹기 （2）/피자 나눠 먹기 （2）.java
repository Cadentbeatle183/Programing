class Solution {
    public int solution(int n) {
        int answer = 0;
        final int pizzacnt=6;
        while(true){
            if((++answer)*6%n==0)
                break;
        }
        return answer;
    }
}