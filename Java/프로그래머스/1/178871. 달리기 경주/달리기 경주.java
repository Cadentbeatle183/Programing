import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        for (String calling : callings) {
            int currentRank = playerMap.get(calling); 
            int frontRank = currentRank - 1;          
            
            String frontPlayer = players[frontRank];   
            
            players[frontRank] = calling;
            players[currentRank] = frontPlayer;
            
            playerMap.put(calling, frontRank);
            playerMap.put(frontPlayer, currentRank);
        }
        
        return players;
    }
}