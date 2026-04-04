class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //일관성을 위해 맨 뒤에 임의의 기호 추가
        my_string=my_string.replace(" ", "")+"+";
        int cnt=0;
        //System.out.println(my_string);
        for(int i=0; i<my_string.length()-1; i++){
            //+ or -면 실행
            if(my_string.charAt(i+1)<'0'){
                //(부호)숫자 부분만 짤라서 형변환
                answer+=Integer.parseInt(my_string.substring(i-cnt, i+1));
                //System.out.println(answer);
                cnt=0;
            }else{
                cnt++;
            }
        }
        return answer;
    }
}