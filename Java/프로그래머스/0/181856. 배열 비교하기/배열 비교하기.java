class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length>arr2.length)
            return 1;
        else if(arr2.length>arr1.length)
            return -1;
        int arrr1=0,arrr2=0;
        for(int i=0; i<arr1.length; i++){
            arrr1+=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arrr2+=arr2[i];
        }
        if(arrr1>arrr2)
            return 1;
        else if(arrr2>arrr1)
            return -1;
        return 0;
    }
}