class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(int i=0; i<keyinput.length; i++){
            if("left".equals(keyinput[i])){
                if(answer[0]>-board[0]/2){
                    answer[0]--;
                }
            }else if("right".equals(keyinput[i])){
                if(answer[0]<board[0]/2){
                    answer[0]++;
                }
            }else if("down".equals(keyinput[i])){
                if(answer[1]>-board[1]/2){
                    answer[1]--;
                }
            }else{
                if(answer[1]<board[1]/2){
                    answer[1]++;
                }
            }
        }
        return answer;
    }
}