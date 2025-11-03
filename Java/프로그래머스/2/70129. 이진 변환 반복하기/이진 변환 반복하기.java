class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zero = 0;
        while (!s.equals("1")) {
            int lengBefore = s.length();
            s = s.replace("0", "");
            int lengAfter = s.length();
            
            zero += (lengBefore - lengAfter);
            s = Integer.toBinaryString(lengAfter);
            count++;
        }
        return new int[]{count, zero};
    }
}