class Solution {
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(Math.abs(arr[min])>Math.abs(arr[j])){
                    min=j;
                }else if(Math.abs(arr[min])==Math.abs(arr[j]) && arr[min]<arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    public int[] solution(int[] numlist, int n) {
        for(int i=0; i<numlist.length; i++){
            numlist[i]-=n;
        }
        numlist=sort(numlist);
        for(int i=0; i<numlist.length; i++){
            //System.out.println(numlist[i]);
            numlist[i]+=n;
        }
        return numlist;
    }
}