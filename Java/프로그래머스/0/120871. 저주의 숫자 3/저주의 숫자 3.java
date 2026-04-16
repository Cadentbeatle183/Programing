class Solution {
    public int solution(int n) {
        if(n<3){
            return n;
        }
        int answer=2;
        for(int i=3; i<=n; i++){
            answer++;
            while(answer%3==0 || (String.valueOf(answer)).contains("3")){
                answer++;
            }
            //System.out.println(answer);
        }
        return answer;
    }
}