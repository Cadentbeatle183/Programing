import java.util.StringTokenizer;
import java.util.NoSuchElementException;
class Solution {
    public String solution(String s) {
        StringTokenizer str=new StringTokenizer(s);
        int first=Integer.parseInt(str.nextToken());
        int min=first,max=first;
        while(str.hasMoreTokens()){
            int temp=Integer.parseInt(str.nextToken());
            if(temp<min)
                min=temp;
            else if(temp>max)
                max=temp;
        }
        return min+" "+max;
    }
}