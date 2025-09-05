class Solution {
    public String solution(int age) {
        String answer = "";
        String Stage=String.valueOf(age);
        for(int i=0; i<Stage.length(); i++){
            answer+=(char)(Stage.charAt(i)-'0'+'a');
        }
        return answer;
    }
}