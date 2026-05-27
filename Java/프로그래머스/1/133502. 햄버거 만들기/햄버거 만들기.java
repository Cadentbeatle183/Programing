import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        for(int i:ingredient){
            if(i==1 && stack.size()>=3){
                if(stack.peek()==3 && stack.get(stack.size()-2)==2 && stack.get(stack.size()-3)==1){
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                    continue;
                }
            }
            stack.push(i);
        }
        return answer;
    }
}