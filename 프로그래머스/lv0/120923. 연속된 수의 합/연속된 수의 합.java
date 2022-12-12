import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
        int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += i;
		}
        return IntStream.range((total - sum) / num, ((total - sum) / num) + num).toArray();
    }
}