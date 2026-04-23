class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strNum={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<strNum.length; i++){
            s=s.replace(strNum[i], String.valueOf(i));
        }
        answer=Integer.parseInt(s);
        return answer;
    }
}