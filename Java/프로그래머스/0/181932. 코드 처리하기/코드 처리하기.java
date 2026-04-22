class Solution {
    public String solution(String code) {
        StringBuffer ret = new StringBuffer();
        int mode=0;
        for(int i=0; i<code.length(); i++){
            char ch=code.charAt(i);
            if(ch=='1'){
                mode=mode==1?0:1;
            }else if((i & 1)==mode){
                ret.append(ch);
            }
        }
        if(ret.length()==0){
            return "EMPTY";
        }else{
            return ret.toString();
        }
    }
}