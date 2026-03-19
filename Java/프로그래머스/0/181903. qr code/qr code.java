class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder str=new StringBuilder();
        for(int i=r; i<code.length(); i+=q){
            str.append(code.charAt(i));
        }
        return str.toString();
    }
}