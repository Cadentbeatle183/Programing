class Solution {
    public int solution(int[] num_list) {
        String hol="",jjak="";
        for(int i:num_list){
            if(i%2==1)
                hol+=i+"";
            else
                jjak+=i+"";
        }
        return Integer.parseInt(hol)+Integer.parseInt(jjak);
    }
}