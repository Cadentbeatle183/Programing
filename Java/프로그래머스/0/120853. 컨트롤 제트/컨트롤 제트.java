class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean flag;
        for(int i=0; i<s.length(); ){
            flag=true;
            int cnt=0;
            if(s.charAt(i)=='Z'){
                i+=2;
                continue;   
            }
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j)==' '){
                    if(s.charAt(j+1)=='Z'){
                       flag=false;
                    }    
                    break;
                }
                else{
                    cnt++;
                }
            }
            if(flag)
                answer+=Integer.parseInt(s.substring(i, i+cnt));
            else
                flag=false;
            // System.out.println(answer);
            i+=cnt+1;
        }
        return answer;
    }
}