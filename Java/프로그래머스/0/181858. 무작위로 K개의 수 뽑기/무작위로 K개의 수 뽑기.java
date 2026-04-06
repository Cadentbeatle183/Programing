class Solution {
    static boolean duplicationCheak(int arr, int[] answer){
        for(int i=0; i<answer.length; i++){
            if(answer[i]==arr){
                return false;
            }
        }
        return true;
    }
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i=0; i<k; i++){
            answer[i]--;
        }
        int index=0;
        for(int i=0; i<arr.length && index<k; i++){
            if(duplicationCheak(arr[i], answer)){
                answer[index++]=arr[i];
            }
        }
        return answer;
    }
}