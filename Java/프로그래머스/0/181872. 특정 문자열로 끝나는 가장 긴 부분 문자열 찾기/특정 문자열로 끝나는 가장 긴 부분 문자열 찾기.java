class Solution {
    public String solution(String myString, String pat) {
        for(int i=myString.length(); i>=0; i--){
            if(pat.equals(myString.substring(i-pat.length(),i)))
                return myString.substring(0, i);
        }
        return "";
    }
}