class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)(Math.ceil((double)my_str.length()/n))];
        int cnt=0;
        for(int i=0; ; i+=n){
            if(i<my_str.length()){
                if(i+n<=my_str.length())
                    answer[cnt++]=my_str.substring(i, i+n);
                else
                    answer[cnt++]=my_str.substring(i, my_str.length());
            }
            else
                return answer;
        }
    }
}