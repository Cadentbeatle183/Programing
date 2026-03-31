class Solution {
    static int binaryToDecimal(String x){
        int Decimal=0;
        for(int i=x.length()-1; i>=0; i--){
            Decimal+=Math.pow(2, x.length()-1-i)*(x.charAt(i)-'0');
        }
        return Decimal;
    }
    static String decimalToBinary(int x){
        if(x == 0) return "0";
        return (x > 1 ? Solution.decimalToBinary(x/2) : "") + "" + x%2;
    }
    public String solution(String bin1, String bin2) {
        int sum = Solution.binaryToDecimal(bin1) + Solution.binaryToDecimal(bin2);
        return Solution.decimalToBinary(sum);
    }
}