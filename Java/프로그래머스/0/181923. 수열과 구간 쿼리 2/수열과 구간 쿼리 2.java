class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            //arr의 원소의 최댓값+1 할당
            int min=1000001;
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                //모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾기
                if(queries[i][2]<arr[j] && min>arr[j]){
                    min=arr[j];
                }
            }
            //min이 바뀌지 않았다면 = 답이 없다면 -1 할당
            if(min==1000001){
                answer[i]=-1;
            }else{
                answer[i]=min;
            }
        }
        return answer;
    }
}