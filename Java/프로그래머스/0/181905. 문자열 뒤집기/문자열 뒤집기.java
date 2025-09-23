class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer str=new StringBuffer();
        for(int i=0; i<my_string.length(); i++){
            if(i>=s&&i<=e)
                str.append(my_string.charAt(e+s-i));
            else
                str.append(my_string.charAt(i));
        }
        return str.toString();
    }
}