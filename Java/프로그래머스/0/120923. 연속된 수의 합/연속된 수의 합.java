import java.util.ArrayList;
class Solution {
    public int[] solution(int num, int total) {
        if(total==0){
            int[] answer=new int[num];
            for(int i=0; i<answer.length; i++){
                answer[i]=i-num/2;
            }
            return answer;
        }
        ArrayList<Integer> arrlist=new ArrayList<>();
        int cnt=0;
        if(total!=total/num*num){
            int left=total/num;
            int right=total/num+1;
            int i=1;
            
            cnt+=left+right;
            arrlist.add(left);
            arrlist.add(right);
            while(cnt!=total){
                cnt+=(left-i)+(right+i);
                arrlist.add(0,left-i);
                arrlist.add(right+i);
                i++;
            }
        }else{
            int mid=total/num;
            int i=1;
            
            cnt+=mid;
            arrlist.add(mid);
            while(cnt!=total){
                cnt+=(mid-i)+(mid+i);
                arrlist.add(0, mid-i);
                arrlist.add(mid+i);
                i++;
            }
        }
        int[] answer=new int[arrlist.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arrlist.get(i);
        }
        return answer;
    }
}