class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        int index=0;
        boolean flag=true;
        for(int i=0; i<str_list.length; i++){
            for(int j=0; j<str_list[i].length(); j++){
                if(str_list[i].charAt(j)==ex.charAt(index)){
                    if(index==ex.length()-1){
                        flag=false;
                        break;
                    }
                    index++;
                }
                else
                    index=0;
            }
            if(flag)
                answer+=str_list[i];
            index=0;
            flag=true;
        }
        return answer;
    }
}