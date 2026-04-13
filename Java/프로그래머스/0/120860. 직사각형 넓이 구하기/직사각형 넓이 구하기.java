class Solution {
    public int solution(int[][] dots) {
        int answer=1;
        for(int i=0; i<2; i++){
            for(int j=0; j<dots.length; j++){
                if(dots[0][i]!=dots[j][i]){
                    answer*=Math.abs(dots[0][i]-dots[j][i]);
                    break;
                }
            } 
        }
        return answer;
    }
}