import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arrList=new ArrayList();
        int stack=0;
        arrList.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[stack]!=arr[i]){
                arrList.add(arr[i]);
                stack=i;
            }
        }
        int[] answer=new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=(int)arrList.get(i);
        }
        return answer;
    }
}