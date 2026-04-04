class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder reverse = new StringBuilder();
        for(int i=0; i<queries.length; i++){
            reverse.append(my_string.substring(queries[i][0], queries[i][1]+1));
            //System.out.println(answer);
            my_string=my_string.substring(0, queries[i][0])+reverse.reverse()+my_string.substring(queries[i][1]+1);
            //System.out.println(my_string);
            reverse.setLength(0);
        }
        return my_string;
    }
}