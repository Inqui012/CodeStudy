class Solution {
    public int solution(int n) {
        int cnt = 1;
        while((n * cnt) % 6 != 0){
            cnt++;
        }
        int answer = (n * cnt) / 6;
        return answer;
    }
}