class Solution {
    public int[] solution(int n) {
        int cnt=1;
        int m=n;
        while(true){
            cnt++;
            if(m%2==0)
                m/=2;
            else
                m=m*3+1;
            if(m==1)
                break;
        }
        System.out.println(cnt);
        int[] answer = new int[cnt];
        answer[0]=n;
        for(int i=1; i<cnt; i++){
            if(n%2==0)
                n/=2;
            else
                n=n*3+1;
            answer[i]=n;
        }
        return answer;
    }
}