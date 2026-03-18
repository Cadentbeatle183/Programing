class Solution {
    public boolean solution(String s) {
        if(Math.abs(s.length()-5)!=1)
            return false;
        try{
            Integer.parseInt(s);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}