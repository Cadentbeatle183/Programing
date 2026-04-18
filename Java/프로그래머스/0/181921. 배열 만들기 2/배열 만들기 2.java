import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        if(l<5){
            return new int[]{-1};
        }
        ArrayList<Integer> arr=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=1; ; i++){
            int n=i;
            do{
                sb.insert(0, n%2);
                n/=2;
                //System.out.println(sb+" "+i);
            }while(n>0);
            n=Integer.parseInt(sb.toString())*5;
            sb.setLength(0);
            if(n>r){
                break;
            }else if(n<l){
                continue;
            }else{
                arr.add(n);
            }
        }
        if(arr.size()==0){
            return new int[]{-1};
        }
        int[] answer=new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}