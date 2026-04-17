import java.util.ArrayList;
class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)){
            return 0;
        }
        int answer = 0;
        StringBuffer sb=new StringBuffer();
        sb.append(A);
        do{
            char temp=sb.charAt(sb.length()-1);
            sb.replace(0, sb.length(), sb.substring(0, sb.length()-1));
            sb.insert(0, temp);
            answer++;
        }while(!sb.toString().equals(B) && answer<B.length());
        if(answer==B.length()){
            return -1;
        }
        return answer;
    }
}