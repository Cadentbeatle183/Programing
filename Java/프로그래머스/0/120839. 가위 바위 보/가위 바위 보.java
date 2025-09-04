class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            switch((int)(rsp.charAt(i)-'0')%4){
                case 0 -> answer+='5';
                case 2 -> answer+='0';
                case 1 -> answer+='2';
            }
        }
        return answer;
    }
}