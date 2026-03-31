class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        int k=1;
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer.append(k);   
            }
            k++;
        }
        String temp=answer.toString()+"0";
        answer.reverse();
        return temp+answer.toString();
    }
}