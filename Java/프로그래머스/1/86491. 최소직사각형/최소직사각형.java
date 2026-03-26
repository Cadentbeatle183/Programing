class Solution {
    public int solution(int[][] sizes) {
        int x=0, y=0;
        for(int i=0; i<sizes.length; i++){
            //index[n][0]>index[n][1] 작업
            if(sizes[i][0]<sizes[i][1]){
                int temp=sizes[i][1];
                sizes[i][1]=sizes[i][0];
                sizes[i][0]=temp;
            }
            //index[n][0] 최댓값
            if(sizes[i][0]>x){
                x=sizes[i][0];
            }
            //index[n][1] 최댓값
            if(sizes[i][1]>y){
                y=sizes[i][1];
            }
        }
        return x*y;
    }
}