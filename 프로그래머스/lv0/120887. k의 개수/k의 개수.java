import java.util.stream.IntStream;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        		int[] arrij = IntStream.rangeClosed(i, j).toArray();
		for(int m : arrij) {
			for(char c : String.valueOf(m).toCharArray()) {
				if(c == k + 48) {
					answer++;
				}
			}
		}
        return answer;
    }
}