class Solution {
    public String solution(String my_string) {
        String answer = "";
        boolean flag=true;
        
        for(int i=0; i<my_string.length(); i++){
            char chI=my_string.charAt(i);
            for(int j=0; j<i; j++){
                if(chI==my_string.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag)
                answer+=chI;
            flag=true;
        }
        return answer;
    }
}