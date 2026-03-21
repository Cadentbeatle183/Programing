class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0; i<order.length; i++){
            String is=order[i];
            if(is.contains("americano")||is.equals("anything"))
               answer+=4500;
            else if(is.contains("cafelatte"))
                answer+=5000;
        }
        return answer;
    }
}