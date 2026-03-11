class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            double temp=((double)n/i-n/i);
            if(i!=1&&temp==0)
                continue;
            if(temp*2==1||temp*2==0){
//                 if(temp%2==0){
//                     for(int j=1; j<=i; j++){
                        
//                     }
//                 }
//                 else{
                    
//                 }
                answer++;
            }
        }
        return answer;
    }
}