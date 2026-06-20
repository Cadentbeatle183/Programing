class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int healthMax=health;
        int attackIndex=0;
        int combo=0;
        for(int i=1; i<=attacks[attacks.length-1][0]; i++){
            if(i==attacks[attackIndex][0]){
                combo=0;
                health-=attacks[attackIndex++][1];
                if(health<=0){
                    return -1;
                }
            }else{
                combo++;
                if(health+bandage[1]<=healthMax){
                    health+=bandage[1];
                }else{
                    health=healthMax;
                }
                if(combo==bandage[0]){
                    if(health+bandage[2]<=healthMax){
                        health+=bandage[2];
                    }else{
                        health=healthMax;
                    }
                    combo=0;
                }
            }
        }//
        return health;
    }
}