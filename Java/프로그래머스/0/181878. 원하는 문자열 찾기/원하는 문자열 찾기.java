class Solution {
    public int solution(String myString, String pat) {
        if(myString.length()<pat.length())
            return 0;
        int index=0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)==pat.charAt(index)||(int)myString.charAt(i)==pat.charAt(index)-'a'+'A'||(int)myString.charAt(i)==pat.charAt(index)-'A'+'a'){
                index++;
                if(index==pat.length())
                    return 1;
            }
            else{
                i-=index;
                index=0;
            }
        }
        return 0;
    }
}