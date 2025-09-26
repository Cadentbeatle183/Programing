class Solution {
    public int[] solution(int[] arr) {
        for(int i=0; (1<<i)<=arr.length; i++){
            if(arr.length==(1<<i))
                return arr;
        }
        int cnt=arr.length;
        int[] answer;
        for(int i=1; ; i++){
            for(int j=1; (1<<j)<=cnt+i; j++){
                if(cnt+i==(1<<j)){
                    answer = new int[cnt+i];
                    for(int k=0; k<cnt; k++)
                        answer[k]=arr[k];
                    for(int k=0; k<i; k++)
                        answer[cnt+k]=0;
                    return answer;
                }
            }
        }
    }
}