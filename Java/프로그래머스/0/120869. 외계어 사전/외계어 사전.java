class Solution {
    static int spellCheck(String[] spell, String dic){
        for(int j=0; j<spell.length; j++){
            if(!dic.contains(spell[j])){
                return 2;
            }
        }
        return 1;
    }
    public int solution(String[] spell, String[] dic) {
        for(int i=0; i<dic.length; i++){
            if(spellCheck(spell, dic[i])==1){
                return 1;
            }
        }
        return 2;
    }
}