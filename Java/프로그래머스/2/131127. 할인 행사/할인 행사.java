import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> Nmap = new HashMap<>();
        for(int i=0; i<want.length; i++){
            Nmap.put(want[i], number[i]);
        }
        for(int i=0; i<discount.length; i++){
            HashMap<String, Integer> NClone = new HashMap<>(Nmap);
            for(int j=i; j<discount.length; j++){
                if(!NClone.containsKey(discount[j]) || NClone.get(discount[j])==0){
                    break;
                }else{
                    NClone.put(discount[j], NClone.get(discount[j])-1);
                    if(NClone.get(discount[j])==0){
                        NClone.remove(discount[j]);
                    }
                }
                // System.out.println(NClone.size());
                if(NClone.isEmpty()){
                    answer++;
                }
            }
        }
        return answer;
    }
}