class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int hasade=0;
        int temp=x;
        for(int i=Integer.parseInt(String.valueOf(x))-1; i>=0; i--){
            hasade+=temp/(int)Math.pow(10,i);
            temp%=Math.pow(10,i);
        }
        System.out.print(hasade+" "+x);
        if(x%hasade!=0)
            answer=false;
        return answer;
    }
}