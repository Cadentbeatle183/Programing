class Solution {
    public int[][] solution(int[][] arr) {
        int length=Math.max(arr.length, arr[0].length);
        int[][] answer = new int[length][length];
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                if(arr.length-1<i || arr[i].length-1<j){
                    answer[i][j]=0;
                }else{
                    answer[i][j]=arr[i][j];
                }
            }
        }
        return answer;
    }
}