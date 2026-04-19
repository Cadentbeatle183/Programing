import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> arrl=new ArrayList<>();
        for(int i:arr){
            arrl.add(i);
        }
        for(int i=0; i<query.length; i++){
            if((i & 1)==0){
                int length=arrl.size();
                for(int j=query[i]+1; j<length; j++){
                    arrl.remove(arrl.size()-1);
                }    
            }else{
                for(int j=0; j<query[i]; j++){
                    arrl.remove(0);
                }
            }
        }
        int[] answer = new int[arrl.size()];
        for(int i=0; i<arrl.size(); i++){
            answer[i]=arrl.get(i);
        }
        return answer;
    }
}