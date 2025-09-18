class Solution {
    boolean solution(String s) {
        int cntP=0,cntY=0;
        s=s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='P')
                cntP++;
            else if(s.charAt(i)=='Y')
                cntY++;
        }
        return cntP==cntY?true:false;
    }
}