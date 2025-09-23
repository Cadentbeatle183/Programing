class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int cnt=0;
        for(String i:intStrs){
            if(Integer.parseInt(i.substring(s,s+l))>k)
                cnt++;
        }
        int[] answer = new int[cnt];
        cnt=0;
         for(String i:intStrs){
            if(Integer.parseInt(i.substring(s,s+l))>k)
                answer[cnt++]=Integer.parseInt(i.substring(s,s+l));
        }
        return answer;
    }
}