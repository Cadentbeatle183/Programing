class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt=0;
        for(boolean i:finished)
            if(!i)
                cnt++;
        String[] answer = new String[cnt];
        int index=0;
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i])
                answer[index++]=todo_list[i];
            if(index==cnt)
                break;
        }
        return answer;
    }
}