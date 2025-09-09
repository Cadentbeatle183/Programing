class Solution {
    public int solution(String myString, String pat) {
        String str="";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='A')
                str+='B';
            else
                str+='A';
        }
        int j=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==pat.charAt(j))
                if(j==pat.length()-1)
                    return 1;
                else
                    j++;
            else
                j=0;
        }
        return 0;
    }
}