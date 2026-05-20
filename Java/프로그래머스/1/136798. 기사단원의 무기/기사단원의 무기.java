class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] limitArr=new int[number];
        for(int i=0; i<limitArr.length; i++){
            for(int j=1; j<=i+1; j++){
                if((i+1)%j==0){
                    limitArr[i]++;
                }
            }
            if(limitArr[i]>limit){
                limitArr[i]=power;
            }
        }
        for(int i:limitArr){
            answer+=i;
        }
        return answer;
    }
}