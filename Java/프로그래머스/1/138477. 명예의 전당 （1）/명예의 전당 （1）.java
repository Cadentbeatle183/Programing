import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] score) {
        int[] answer = new int[score.length];
        int[] karr=new int[n];
        for(int i=0; i<n; i++){
            karr[i]--;
        }
        for(int i=0; i<score.length; i++){
            for(int j=0; j<karr.length; j++){
                if(karr[j]==-1 || karr[j]<score[i]){
                    for(int k=n-2; k>=j; k--){
                        karr[k+1]=karr[k];    
                    }
                    karr[j]=score[i];
                    break;
                }
            }
            // for(int j=0; j<karr.length; j++){
            //     System.out.print(karr[j]+" ");
            // }
            // System.out.println();
            for(int j=n-1; j>=0; j--){
                if(karr[j]!=-1){
                    answer[i]=karr[j];
                    break;
                }
            }
        }
        return answer;
    }
}