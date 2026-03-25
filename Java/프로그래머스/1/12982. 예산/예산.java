class Solution {
    public int solution(int[] d, int budget) {
        for(int i=0; i<d.length-1; i++){
            int last=i;
            int j;
            for(j=i+1; j<d.length; j++){
                if(d[last]>d[j]){
                    last=j;
                }
            }
            if(i!=j){
                int temp=d[i];
                d[i]=d[last];
                d[last]=temp;
            }
        }
        int answer = 0;
        for(int i=0; i<d.length; i++){
            if(budget-d[i]>=0){
                answer++;
                budget-=d[i];
            }
        }
        return answer;
    }
}