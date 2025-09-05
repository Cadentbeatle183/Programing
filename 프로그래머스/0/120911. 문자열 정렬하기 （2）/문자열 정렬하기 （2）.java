import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='A'&&my_string.charAt(i)<='Z')
                answer+=(char)(my_string.charAt(i)-'A'+'a');
            else
                answer+=my_string.charAt(i);
        }
        System.out.print(answer);
        
        char[] answerch=new char[answer.length()];
        for(int i=0; i<answer.length(); i++){
            answerch[i]=answer.charAt(i);
        }
        Arrays.sort(answerch);
        // answer="";
        // for(char i:answerch){
        //     answer+=i;
        // }
        return new String(answerch);
    }
}