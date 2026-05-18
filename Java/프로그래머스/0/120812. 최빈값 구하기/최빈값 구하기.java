import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int length=0;
        int n=-1;
        Arrays.sort(array);
        for(int i:array){
            if(n!=i){
                length++;
                n=i;
            }
        }
        
        int[][] mode=new int[length][2];
        n=-1;
        int j=-1;
        for(int i=0; i<array.length; i++){
            if(n!=array[i]){
                j++;    
                n=array[i];
            }
            mode[j][1]++;
            mode[j][0]=array[i];
        }
        
        // for(int i=0; i<mode.length; i++){
        //     System.out.println(mode[i][0]+" "+mode[i][1]+" ");
        // }
        
        int max=-1;
        for(int i=0; i<mode.length; i++){
            if(max<mode[i][1]){
                max=mode[i][1];
            }
        }
        int cnt=0;
        for(int i=0; i<mode.length; i++){
            if(mode[i][1]==max){
                cnt++;
                answer=mode[i][0];
            }
        }
        if(cnt>1){
            return -1;
        }
        return answer;
    }
}