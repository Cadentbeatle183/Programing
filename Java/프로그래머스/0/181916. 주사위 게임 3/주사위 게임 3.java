import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr); 
        
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
        }

        if (cnt == 6) {
            return 1111 * arr[0];
        } else if (cnt == 3) {
            int p = arr[1]; 
            int q = (arr[0] == p) ? arr[3] : arr[0];
            return (int) Math.pow(10 * p + q, 2);
        } else if (cnt == 2) {
            int p = arr[0];
            int q = arr[3];
            return (p + q) * Math.abs(p - q);
        } else if (cnt == 1) {
            int q = 0;
            int r = 0;
            if (arr[0] == arr[1]) { 
                q = arr[2]; r = arr[3]; 
            }else if (arr[1] == arr[2]) { 
                q = arr[0]; r = arr[3]; 
            }else {
                q = arr[0]; r = arr[1]; 
            }
            return q * r;
        } else {
            return arr[0];
        }
    }
}