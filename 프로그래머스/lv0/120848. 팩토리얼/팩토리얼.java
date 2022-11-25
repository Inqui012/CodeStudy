class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for(int i = 1; factorial <= n; i++){
            factorial *= i;
            answer++;
        }
        return answer - 1;
    }
}