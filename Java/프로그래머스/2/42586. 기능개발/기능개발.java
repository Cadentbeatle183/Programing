import java.util.Stack;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> speedsStack=new Stack<>();
        
        for(int i=progresses.length-1; i>=0; i--){
            stack.push(progresses[i]);
            speedsStack.push(speeds[i]);
        }
        
        ArrayList<Integer> arrList=new ArrayList<>();
        int day=0;
        int cnt=0;
        while(stack.size()!=0){
            day++;
            cnt=0;
            while(stack.size()>0 && stack.peek()+day*speedsStack.peek()>=100){
                stack.pop();
                speedsStack.pop();
                cnt++;
            }
            
            if(cnt!=0){
                arrList.add(cnt);
                System.out.println(day);
            }
        }
        
        int[] answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arrList.get(i);
        }
        return answer;
    }
}