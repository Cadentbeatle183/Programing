import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList=new ArrayList<>();
        boolean flag=false;
        int min=0, max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                min=i;
                break;
            }
        }
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==2){
                max=i;
                break;
            }
        }
        if(min+max==0)
            return new int[]{-1};
        int[] answer=new int[max-min+1];
        int j=0;
        for(int i=min; i<=max; i++){
            answer[j++]=arr[i];
        }
        return answer;
    }
}