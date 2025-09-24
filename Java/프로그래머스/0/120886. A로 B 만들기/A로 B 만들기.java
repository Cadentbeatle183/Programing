class Solution {
    public int solution(String before, String after) {
        int b=0;
        int a=0;
        for(int i=0; i<before.length(); i++){
            b+=before.charAt(i);
            a+=after.charAt(i);
        }
        return a==b?1:0;
    }
}