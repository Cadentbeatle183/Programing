class Solution {
    public String[] solution(String my_string) {
        int cnt=0;
        boolean flag=true;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)!=' '&&flag){
                flag=false;
                cnt++;
            }
            else if(my_string.charAt(i)==' '&&!flag){
                flag=true;
            }
        }
        String[] answer = new String[cnt];
        for(int i=0; i<cnt; i++)
            answer[i]="";
        int i=0;
        int j=0;
        flag=true;
        while(i < my_string.length()){
            if(my_string.charAt(i)!=' '){
                answer[j]+=my_string.charAt(i);
                flag=false;
            }
            else if(!flag){
                j++;
                flag=true;
            }
            i++;
        }
        return answer;
    }
}