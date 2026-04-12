class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] answer=new int[3];
        int score=1, cnt=0;
        while(cnt<3){
            for(int i=0; i<rank.length; i++){
                if(score==rank[i] && attendance[i]){
                    answer[cnt++]=i;
                }
            }
            score++;
        }
        
        // for(int i=0; i<answer.length; i++){
        //     System.out.println(answer[i]);
        // }
        return 10000*answer[0]+100*answer[1]+answer[2];
    }
}