import java.util.Arrays;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        Arrays.sort(works);
        while(n!=0){
            while (n > 0) {
            int lastIdx = works.length - 1;
            int max = works[lastIdx];
            
            if (max == 0) return 0;
                for (int i = lastIdx; i >= 0; i--) {
                    if (works[i] == max && n > 0) {
                        works[i]--;
                        n--;
                    } else {
                        break; 
                    }
                }
            }   
        }
        for(int i=0; i<works.length; i++){
            answer += works[i]*works[i]; 
        }
        return answer;
    }
}