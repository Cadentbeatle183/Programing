class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr=polynomial.split(" \\+ ");
        int a=0,b=0;
        for(String n:arr){
            if(n.contains("x")){
                if(n.length()==1){
                    a++;
                }else{
                    a+=Integer.parseInt(n.substring(0, n.length()-1));
                }
            }else{
                b+=Integer.parseInt(n);
            }
        }
        if(a>0&&b>0){
            answer="x + "+b;
            if(a!=1){
                answer=a+answer;
            }
        }else if(a==0){
            answer=b+"";
        }else{
            answer="x";
            if(a!=1){
                answer=a+answer;
            }
        }
        return answer;
    }
}