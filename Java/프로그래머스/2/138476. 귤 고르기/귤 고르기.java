import java.util.ArrayList;
import java.util.Arrays;
class Solution {
//     public static int[] sort(int[] arr){
//         //정렬
//         for(int i=0; i<arr.length; i++){
//             int last=i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[last]>arr[j])
//                     last=j;
//             }
//             if(last!=i){
//                 int temp=arr[i];
//                 arr[i]=arr[last];
//                 arr[last]=temp;
//             }  
//         }
        
//         return arr;
//     }
    public int solution(int k, int[] tangerine) {
        
        Arrays.sort(tangerine);
        
        // for(int i=0; i<tangerine.length; i++){
        //     System.out.println(tangerine[i]);
        // }
        
        // 숫자 당 몇 개 있는지 cnt
        int first=0, end=0;
        ArrayList<Integer> cntArry=new ArrayList<>();
        for(int i=0; i<tangerine.length; ){
            first=i;
            int j;
            for(j=i; j<tangerine.length; j++){
                if(tangerine[j]!=tangerine[i]){
                    break;
                }
            }
            end=j;
            i=j;
            cntArry.add(end-first);
        }
        
        // for(int i=0; i<cnt.size(); i++){
        //     System.out.println(cnt.get(i));
        // }
        
        //배열로 변환하고 오름차순 정렬
        int[] answerArry=new int[cntArry.size()];
        for(int i=0; i<answerArry.length; i++){
            answerArry[i]=cntArry.get(i);
        }
        Arrays.sort(answerArry);
        
        //내림차순으로 k에다 빼보면서 cnt 증가 
        int cnt=0;
        for(int i=answerArry.length-1; i>=0; i--){
            k-=answerArry[i];
            cnt++;
            if(k<=0)
                break;
        }
        
        return cnt;
    }
}