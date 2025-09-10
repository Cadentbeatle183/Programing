class Solution {
    public int solution(String my_string, String target) {
        int index=0;
        for(int i=0; i<my_string.length(); i++){
            if(target.charAt(index)==my_string.charAt(i)){
                index++;
                if(index==target.length())
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