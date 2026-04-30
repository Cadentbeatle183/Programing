class Solution {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;

        // 선택 정렬(Selection Sort) 알고리즘 적용
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                char charMin = strings[min].charAt(n);
                char charJ = strings[j].charAt(n);

                // 조건 1: n번째 문자가 더 작으면 최솟값 인덱스 갱신
                if (charMin > charJ) {
                    min = j;
                } 
                
                // 조건 2: n번째 문자가 같으면 전체 문자열 사전순 비교
                else if (charMin == charJ) {
                    if (strings[min].compareTo(strings[j]) > 0) {
                        min = j;
                    }
                }
            }

            if (min != i) {
                String temp = strings[i];
                strings[i] = strings[min];
                strings[min] = temp;
            }
        }

        return strings;
    }
}