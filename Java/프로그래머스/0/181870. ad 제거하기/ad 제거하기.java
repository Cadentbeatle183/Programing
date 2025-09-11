class Solution {
    public String[] solution(String[] strArr) {
        int cnt=0;
        for(int i=0; i<strArr.length; i++){
            for(int j=0; j<strArr[i].length()-1; j++){
                if(strArr[i].charAt(j)=='a'){
                    j++;
                    if(strArr[i].charAt(j)=='d'){
                        cnt++;
                        break;
                    }
                    else
                        j--;
                }
            }
        }
        String[] answer = new String[strArr.length-cnt];
        cnt=0;
        for(int i=0; i<strArr.length; i++){
            boolean flag=true;
            for(int j=0; j<strArr[i].length()-1; j++){
                if(strArr[i].charAt(j)=='a'){
                    j++;
                    if(strArr[i].charAt(j)=='d'){
                        flag=false;  
                        break;
                    }
                    else
                        j--;
                }
            }
            if(flag)
                answer[cnt++]=strArr[i];
        }
        return answer;
    }
}