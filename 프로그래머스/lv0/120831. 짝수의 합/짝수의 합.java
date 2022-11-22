class Solution {
    public int solution(int n) {
        int answer = 0;
		if ((n / 2) % 2 == 0) {
			answer = (2 + n) * ((n / 2) / 2);
		} else {
			answer = (2 + n) * ((n / 2) / 2) + ((n / 2) + 1);
		}
        return answer;
    }
}