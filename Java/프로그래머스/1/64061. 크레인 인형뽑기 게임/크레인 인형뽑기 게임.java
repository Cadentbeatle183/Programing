import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> picks = new Stack<>();
        
        for(int i=0; i<moves.length; i++){
            moves[i]--;
            
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]]!=0){
                    if(picks.empty() || picks.peek()!=board[j][moves[i]]){
                        picks.push(board[j][moves[i]]);
                        //System.out.println(picks.peek()+" pick");
                    }else{
                        //System.out.println(picks.peek()+" "+board[j][moves[i]]);
                        picks.pop();
                        answer+=2;
                    }
                    board[j][moves[i]]=0;
                    break;
                }
            }
        }
        return answer;
    }
}