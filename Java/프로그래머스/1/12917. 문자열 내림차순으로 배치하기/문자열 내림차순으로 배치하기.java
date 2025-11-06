import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] chararr=s.toCharArray();
        Arrays.sort(chararr);
        StringBuffer answer=new StringBuffer(new String(chararr));
        return answer.reverse().toString();
    }
}