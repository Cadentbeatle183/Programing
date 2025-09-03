class Solution {
    public int solution(int price) {
        int answer = 0;
        switch(price/100000){
            case 0 -> answer=price;
            case 1,2 -> answer=price*95/100;
            case 3,4 -> answer=price*90/100;
            default -> answer=price*80/100;
        }
        return answer;
    }
}