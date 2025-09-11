class Solution {
    public int solution(int[] num_list) {
        int hol=0;
        int JJak=0;
        for(int i=1; i<num_list.length; i+=2)
            hol+=num_list[i];
        for(int i=0; i<num_list.length; i+=2)
            JJak+=num_list[i];
        return hol>JJak?hol:JJak;
    }
}