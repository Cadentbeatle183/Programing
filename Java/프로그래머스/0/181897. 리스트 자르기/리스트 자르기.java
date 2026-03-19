class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int min=0, max=num_list.length-1;
        int plus=1;
        switch(n){
            case 1 : max=slicer[1]; break;
            case 2 : min=slicer[0]; break;
            case 4 : plus=slicer[2];
            case 3 :
                min=slicer[0];
                max=slicer[1];
                break;
        }
        int[] answer = new int[(max-min)/plus+1];
        int j=0;
        for(int i=min; i<=max; i+=plus){
            answer[j++]=num_list[i];
        }
        return answer;
    }
}