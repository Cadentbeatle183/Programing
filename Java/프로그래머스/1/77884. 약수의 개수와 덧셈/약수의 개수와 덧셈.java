class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int j=left; j<=right; j++){
            int cnt = 0;
            for (int i = 1; i * i <= j; i++) {
	            if (i * i == j) cnt++;
	            else if (j % i == 0) cnt += 2;
            }
            if(cnt%2==0)
                answer+=j;
            else
                answer-=j;
        }
        return answer;
    }
}