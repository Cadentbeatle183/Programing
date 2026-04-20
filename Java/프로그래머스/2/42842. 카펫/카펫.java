class Solution {
    public int[] solution(int brown, int yellow) {
        int area=brown+yellow;
        for(int i=3; i<=Math.sqrt(area); i++){
           if(area%i==0 && (i-2)*(area/i-2)==yellow){
               return new int[]{area/i, i};
           } 
        }
        return new int[]{0,0};
    }
}