import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(stk.size()==0)
                stk.add(arr[i]);
            else if(stk.get(stk.size()-1)==arr[i])
                stk.remove(stk.size()-1);
            else
                stk.add(arr[i]);
        }
        if(stk.size()==0)
            return new int[]{-1};
        int[] answer=new int[stk.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=Integer.valueOf(stk.get(i));
        }
        return answer;
    }
}