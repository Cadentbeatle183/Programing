class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1]-common[0]==common[common.length-1]-common[common.length-2]){
            return common[common.length-1]+(common[1]-common[0]);
        }else{
            return common[1]/common[0]*common[common.length-1];
        }
    }
}