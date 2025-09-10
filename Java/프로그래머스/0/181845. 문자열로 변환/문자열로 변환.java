class Solution {
    public String solution(int n) {
        int cnt=1;
        int index=10;
        String answer="";
        while(true){
            if(n/index==0){
                index/=10;
                break;
            }
            index*=10;
            cnt++;
        }
        System.out.print(index);
        for(int i=1; i<=cnt; i++){
            answer+=(char)('0'+n/index);
            n=n%index;
            index/=10;
        }
        return answer;
    }
}