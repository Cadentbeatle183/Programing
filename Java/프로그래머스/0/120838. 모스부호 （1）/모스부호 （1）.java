class Solution {
    public String solution(String letter) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int index=0;
        String answer = "";
        letter+=' ';
        for(int i=0; i<letter.length(); i++){
            if(letter.charAt(i)==' '){
                for(int j=0; j<morse.length; j++){
                    if(letter.substring(index, i).equals(morse[j]))
                        answer+=(char)('a'+j);
                }
                index=i+1;
            }
        }
        return answer;
    }
}