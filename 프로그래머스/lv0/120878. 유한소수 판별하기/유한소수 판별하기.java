class Solution {
    private int gcd(int a, int b){
        while(b != 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public int solution(int a, int b) {
        int answer = 1;
        int gcdB = b / gcd(a, b);
        while(gcdB % 2 == 0 || gcdB % 5 == 0){
        	if(gcdB % 2 == 0) {
        		gcdB /= 2;
        	} else if (gcdB % 5 == 0) {
        		gcdB /= 5;
        	}
        }
        if(gcdB != 1){
            answer = 2;
        }
        return answer;
    }
}