class Solution {
    public int solution(int order) {
        int answer = 0;
        for(int i=String.valueOf(order).length()-1; i>=0; i--){
            System.out.print(order+" ");
            if(order/(int)Math.pow(10, i)%3==0&&order/(int)Math.pow(10, i)!=0){
                answer++;
                System.out.print(order+" ");
            }
            order%=(int)Math.pow(10, i);
        }
        return answer;
    }
}