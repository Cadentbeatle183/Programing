class Solution {
    public String solution(int a, int b) {
        int answer = 4+16+(a<=2?-1:0)+6+b;
        switch(a){
            case 1, 10 : answer+=1; break;
            case 2,3,11 : answer+=4;break;
            case 4, 7 : answer+=0;break;
            case 5 : answer+=2;break;
            case 6 : answer+=5;break;
            case 8 : answer+=3;break;
            case 9,12 : answer+=6;break;
        }
        System.out.println(answer);
        answer%=7;
        System.out.println(answer);
        String[] week={"SAT","SUN","MON","TUE","WED","THU","FRI"};
        return week[answer];
        // return "SAT";
    }
}