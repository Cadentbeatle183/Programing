class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==1){
                    for(int k=i-1; k<=i+1; k++){
                        for(int l=j-1; l<=j+1; l++){
                            if((k>=0&&k<board.length)&&(l>=0&&l<board[i].length)){
                                if(board[k][l]!=1){
                                    board[k][l]=-1;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}