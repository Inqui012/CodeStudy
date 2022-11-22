class Solution {
    static int gcd(int a, int b) {
		while (b != 0) {
			int t = a;
			a = b;
			b = t % b;
		}
		return a;
	}
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {0, 0};
        answer[0] = (denum1 * num2) + (denum2 * num1);
        answer[1] = (num1 * num2);
        int a = gcd(answer[0], answer[1]);
        answer[0] /= a;
        answer[1] /= a;
        
        return answer;
    }
}