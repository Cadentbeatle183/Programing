class Solution {
    public String[] solution(String my_string) {
        int cnt=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)==' ')
                cnt++;
        }
        String[] answer = new String[cnt+1];
        for(int i=0; i<answer.length; i++)
            answer[i]="";
        cnt=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)==' '){
                cnt++;
            }
            else
                answer[cnt]+=my_string.charAt(i);
        }
        return answer;
    }
}