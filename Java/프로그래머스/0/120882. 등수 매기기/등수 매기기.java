class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        for(int i=0; i<score.length; i++){
            avg[i]=(score[i][0]+score[i][1])/2.0;
        }
        int[] answer=new int[score.length];
        for(int i=0; i<avg.length; i++){
            answer[i]++;
            for(int j=i+1; j<avg.length; j++){
                if(avg[i]<avg[j]){
                    answer[i]++;
                }else if(avg[i]>avg[j]){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}