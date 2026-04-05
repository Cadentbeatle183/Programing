class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        for(int i=0; i<share; i++){
            answer*=balls-i;
        }
        for(int i=share; i>1; i--){
            answer/=i;
        }
        return (int)answer;
    }
}