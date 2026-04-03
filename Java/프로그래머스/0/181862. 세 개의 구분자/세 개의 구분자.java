class Solution {
    public String[] solution(String myStr) {
        StringBuilder myStrBuilder=new StringBuilder();
        boolean flag=false;
        int cnt=1;
        
        // d~z면 S.B.에 추가하고 flag를 true 바꿈
        // flag가 true면 구분자 , 를 추가하고 cnt를 1올리고 flag를 false로 변경함
        for(int i=0; i<myStr.length(); i++){
            if(myStr.charAt(i)>'c'){
                myStrBuilder.append(myStr.charAt(i));
                flag=true;
            }else if(flag){
                myStrBuilder.append(",");
                cnt++;
                flag=false;
            }
        }
        //일관성을 위해 마지막에 구분자 추가
        myStrBuilder.append(",");
        
        //S.B. 길이가 1 (, 밖에 없다면) 이라면 "EMPTY"를 return
        if(myStrBuilder.length()==1){
            return new String[]{"EMPTY"};
        }
        
        //구분자 , 로 나눠서 배열에 입력, 배열 길이는 cnt 값
        String[] answer=new String[cnt];
        int index=0;
        cnt=0; //cnt 재사용을 위한 초기화
        for(int i=0; i<myStrBuilder.length(); i++){
            if(myStrBuilder.charAt(i)!=','){
                cnt++;
            }else{
                //구분자가 나왔으면 구분자 전 문자열 길이인 cnt를 i에 빼서 시작점을 구하고 i를 도착점으로 사용해서 
                //문자열을 자른 뒤 배열에 할당
                answer[index++] =myStrBuilder.substring(i-cnt, i); 
                cnt=0;
            }
        }
        return answer;
    }
}