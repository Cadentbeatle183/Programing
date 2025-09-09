class Solution {
    public int solution(String str1, String str2) {
        int index=0;
        for(int i=0; i<str2.length(); i++){
            if(str1.charAt(index)==str2.charAt(i)){
                index++;
                if(index==str1.length())
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