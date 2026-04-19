class Solution {
    public String solution(String s, int n) {
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                if(ch>='a'){
                    answer.append((char)('a'+(ch+n)%'a'%('z'-'a'+1)));
                }else{
                    answer.append((char)('A'+(ch+n)%'A'%('z'-'a'+1)));
                }
            }else{
                answer.append(' ');
            }
        }
        return answer.toString();
    }
}