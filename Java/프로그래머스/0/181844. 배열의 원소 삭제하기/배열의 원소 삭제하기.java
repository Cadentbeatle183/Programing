class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    cnt++;
                    break;
                }
            }
        }
        int[] answer = new int[arr.length-cnt];
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(k==answer.length)
                break;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    k--;
                    break;
                }
                else
                    answer[k]=arr[i];
            }
            k++;
        }
        return answer;
    }
}