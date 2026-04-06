class Solution {
    public long solution(String numbers) {
        StringBuilder SB=new StringBuilder();
        long answer = 0;
        for(int i=0; i<numbers.length(); i++){
            SB.append(numbers.charAt(i));
            int n=-1;
            switch(SB.toString()){
                case "zero" : n=0; break;
                case "one" : n=1; break;
                case "two" : n=2; break;
                case "three" : n=3; break;
                case "four" : n=4; break;
                case "five" : n=5; break;
                case "six" : n=6; break;
                case "seven" : n=7; break;
                case "eight" : n=8; break;
                case "nine" : n=9; break;
            }
            if(n!=-1){
                answer=answer*10+n;
                SB.setLength(0);
            }
        }
        return answer;
    }
}