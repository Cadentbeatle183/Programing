import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] road = new int[200];
        
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            for (int i = start; i < end; i++) {
                road[i]++;
            }
        }
        
        for (int count : road) {
            if (count >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}