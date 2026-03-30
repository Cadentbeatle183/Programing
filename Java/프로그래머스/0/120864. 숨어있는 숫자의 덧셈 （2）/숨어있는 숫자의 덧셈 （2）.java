class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            int temp=0;
            if(my_string.charAt(i)>='0'&&my_string.charAt(i)<='9'){
                int j;
                for(j=i; j<my_string.length(); j++){
                    if(my_string.charAt(j)<'0'||my_string.charAt(j)>'9')
                        break;   
                }
                if(i!=j)
                    answer+=Integer.parseInt(my_string.substring(i, j));
                // System.out.println(answer + " "+i+" "+j);
                i=j;
            }
        }
        return answer;
    }
}