class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int sign=0;
        for(int i=0; i<binomial.length(); i++){
            if(binomial.charAt(i)=='+'||binomial.charAt(i)=='-'||binomial.charAt(i)=='*'){
                sign=i;
                break;
            }
        }
        int a=0,b=0;
        int cnt=0;
        for(int i=sign-2; i>=0; i--){
            a+=(binomial.charAt(i)-'0')*Math.pow(10,cnt++);
        }
        cnt=0;
        for(int i=binomial.length()-1; i>=sign+2; i--){
            b+=(binomial.charAt(i)-'0')*Math.pow(10,cnt++);
        }
        switch(binomial.charAt(sign)){
            case '+' : return a+b;
            case '-' : return a-b;
            case '*' : return a*b;
        }
        return 0;
    }
}