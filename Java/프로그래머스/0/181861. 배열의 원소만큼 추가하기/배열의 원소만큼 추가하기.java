class Solution {
    public int[] solution(int[] arr) {
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<=arr[i]; j++)
                cnt++;
        }
        int[] answer = new int[cnt];
        int j=0;
        
        for(int i=0; i<arr.length; i++){
            cnt=0;
            while(true){
                if(arr[i]==cnt)
                    break;
                answer[j++]=arr[i];
                cnt++;
            }
        }
        return answer;
    }
}