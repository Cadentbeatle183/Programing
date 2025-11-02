class Solution {
    public String solution(String s) {
        StringBuffer answer=new StringBuffer();
        answer.append((s.charAt(0)+"").toUpperCase());
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==' '){
                for(; i<s.length()-1; ){
                    answer.append(' ');
                    i++;
                    if(s.charAt(i)!=' ')
                        break;
                }
                answer.append((s.charAt(i)+"").toUpperCase());
            }
            else{
                answer.append((s.charAt(i)+"").toLowerCase());
            }
        }
        return answer.toString();
    }
}