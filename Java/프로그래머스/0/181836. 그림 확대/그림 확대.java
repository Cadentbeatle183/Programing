class Solution {
    public String[] solution(String[] picture, int n) {
        String[] answer = new String[picture.length*n];
        StringBuilder SB=new StringBuilder();
        
        for(int i=0; i<picture.length; i++){
            //SB에 n배된 picture 문자열 넣기
            for(int j=0; j<picture[i].length(); j++){
                for(int k=0; k<n; k++){
                    SB.append(picture[i].charAt(j));
                }
            }
            
            //SB를 answer에 집어넣고 초기화 하기
            for(int j=0; j<n; j++){
                answer[i*n+j]=SB.toString();
            }
            SB.setLength(0);
        }
        return answer;
    }
}