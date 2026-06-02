class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] poster=new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(j<section.length && section[j]==i+1){
                poster[i]=0;
                j++;
            }else{
                poster[i]=1;
            }
        }
        
        for(int i=0; i<poster.length; i++){
            // System.out.print(poster[i]+", ");
            if(poster[i]==0){
                for(j=i; j<i+m && j<poster.length; j++){
                    poster[j]=1;
                }
                answer++;
            }
        }
        return answer;
    }
}