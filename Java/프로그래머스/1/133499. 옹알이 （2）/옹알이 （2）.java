class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strs={"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++){
            String temp=babbling[i];
            String prev="";
            for(int j=0; j<temp.length(); j++){
                for(String k:strs){
                    if(prev.equals(k)){
                        continue;
                    }
                    if(k.length()<=temp.length() && temp.substring(0, k.length()).equals(k)){
                        temp=temp.substring(k.length(), temp.length());
                        prev=k;
                        j=0;
                        break;
                    }
                }
            }
            babbling[i]=temp;
        }
        
        for(String i:babbling){
            //System.out.println(i);
            if(i.equals("")){
                answer++;
            }   
        }
        return answer;
    }
}