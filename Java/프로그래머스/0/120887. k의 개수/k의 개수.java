class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i<=j; i++){
            String istr=String.valueOf(i);
            for(int index=0; index<istr.length(); index++){
                if(istr.charAt(index)-'0'==k)
                    answer++;
            }
        }
        return answer;
    }
}