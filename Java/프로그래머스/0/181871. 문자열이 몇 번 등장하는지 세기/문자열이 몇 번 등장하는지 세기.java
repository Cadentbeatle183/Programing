class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int cnt=0;
        for(int i=0; i<myString.length(); i++){
            cnt=0;
            for(int j=0; j<pat.length(); j++){
                if(i+j>=myString.length())
                    break;
                if(myString.charAt(i+j)==pat.charAt(j)){
                    cnt++;
                }
                else
                    break;
            }
            if(cnt==pat.length())
                answer++;
        }
        return answer;
    }
}