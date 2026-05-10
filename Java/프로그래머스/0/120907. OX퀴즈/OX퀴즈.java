class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] eqn=quiz[i].split(" ");
            int x=Integer.parseInt(eqn[0]), y=Integer.parseInt(eqn[2]);
            int z=0;
            switch(eqn[1]){
                case "+": z=x+y; break;
                case "-": z=x-y; break;
                case "*": z=x*y; break;
                case "/": z=x/y; break;
                case "%": z=x%y; break;
            }
            if(Integer.parseInt(eqn[4])==z){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
        }
        return answer;
    }
}