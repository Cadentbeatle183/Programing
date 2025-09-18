class Solution {
    public long solution(long n) {
        String str=n+"";
        Long answer=0L;
        for(int j=9; j>=0; j--)
            for(int i=0; i<str.length(); i++)
                if(j==str.charAt(i)-'0'){
                    answer*=10L;
                    answer+=(long)(str.charAt(i)-'0');
                }
        return answer;
    }
}