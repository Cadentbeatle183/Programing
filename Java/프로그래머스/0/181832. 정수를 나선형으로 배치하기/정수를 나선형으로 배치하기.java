class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int top=0;
        int bottom=n-1;
        int right=n-1;
        int left=0;
        int i=1;
        while(i<=n*n){
            for(int j=left; j<=right; j++){
                answer[top][j]=i++;
            }
            top++;
            for(int j=top; j<=bottom; j++){
                answer[j][right]=i++;
            }
            right--;
            for (int j=right; j>=left; j--) {
                answer[bottom][j]=i++;
            }
            bottom--;
            for (int j=bottom; j>=top; j--) {
                answer[j][left]=i++;
            }
            left++;
        }
        return answer;
    }
}