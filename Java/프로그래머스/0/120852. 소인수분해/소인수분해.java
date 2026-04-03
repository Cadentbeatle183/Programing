import java.util.ArrayList;
class Solution {
    //이 수가 소수인지 아닌지 판별
    static boolean isPrime(int n){
        if(n<=3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i<=n/2; i+=6){
            if(n%(i+2)==0 || n%(i)==0){
                return false;
            }
        }
        return true;
    }
    
    //소수 배열 생성 메소드
    static Object[] primeArryMake(int n){
        ArrayList<Integer> answer=new ArrayList<>();
        if(isPrime(n)){
            return new Object[]{n};
        }
        
        if(n%2==0){
            answer.add(2);
        }
        if(n%3==0){
            answer.add(3);
        }
        //2와 3을 제외한 소수는 모두 6n+1 or 6n-1이기에 그 부분만 체크
        for(int i=5; i<=n/2; i+=6){
            // 일대일대응이 아니므로 6n-1, 6n+1 숫자가 소수인지 판별
            if(n%(i)==0 && isPrime(i)){
                answer.add(i);
            }
            if(n%(i+2)==0 && isPrime(i+2)){
                if(i+2<=n/2){
                    answer.add(i+2);
                }
            }
        }
        return answer.toArray();
    }
    public Object[] solution(int n) {
        return primeArryMake(n);
    }
}