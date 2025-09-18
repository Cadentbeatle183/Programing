import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        int cnt=0;
        boolean flag=true;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)!='x'&&flag){
                flag=false;
                cnt++;
            }
            else if(myString.charAt(i)=='x')
                flag=true;
        }
        String[] answer = new String[cnt];
        for(int i=0; i<answer.length; i++)
            answer[i]="";
        int index=0;
        flag=false;
        for(int i=0; i<answer.length; ){
            if(myString.charAt(index)!='x'){
                answer[i]+=myString.charAt(index);
                flag=true;
            }
            else if(flag){
                i++;
                flag=false;
            }
            index++;
            if(index==myString.length())
                break;
        }
        Arrays.sort(answer);
        return answer;
    }
}