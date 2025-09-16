class Solution {
    public int solution(int[] num_list) {
        int x=0,y=1;
        for(int i:num_list){
            x+=i;
            y*=i;
        }
        return x*x>y?1:0;
    }
}