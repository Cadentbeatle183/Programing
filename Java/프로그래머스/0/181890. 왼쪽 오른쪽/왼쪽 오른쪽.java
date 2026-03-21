class Solution {
    public String[] solution(String[] str_list) {
        String[] answer={};
        int length=1;
        for(int i=0; i<str_list.length; i++){
            int cnt=0;
            if(str_list[i].equals("l")){
                if(i==0)
                    return new String[]{};
                answer=new String[i];
                for(int j=0; j<i; j++){
                    answer[cnt++]=str_list[j];
                }
                return answer;
            }
            else if(str_list[i].equals("r")){
                 if(i==str_list.length-1)
                    return new String[]{};
                answer=new String[str_list.length-i-1];
                for(int j=i+1; j<str_list.length; j++){
                    answer[cnt++]=str_list[j];
                }
                return answer;
            }
        }
        return new String[]{};
    }
}