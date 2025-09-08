class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(alp.charAt(0)==my_string.charAt(i))
                answer+=(char)(my_string.charAt(i)-'a'+'A');
            else
                answer+=my_string.charAt(i);
        }
        return answer;
    }
}