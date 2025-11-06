import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)
            return new int[]{-1};
        int[] answer=new int[arr.length-1];
        int[] arrreal=arr.clone();
        Arrays.sort(arr);
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[0]!=arrreal[i])
            answer[j++]=arrreal[i];
        }
        return answer;
    }
}