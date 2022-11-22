import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int maxNum = 0;
		int maxIdx = 0;
        int duplNum = 0;
        int answer = 0;
		Arrays.sort(array);
		int[] count = new int[array[array.length - 1] + 1];
		for(int i = 0; i < array.length; i++) {
			count[array[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (maxNum < count[i]) {
				maxNum = count[i];
				maxIdx = i;
			}
		}
        answer = maxIdx;
		loop01: for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (count[i] == maxNum && i != j && count[j] == maxNum) {
					answer = -1;
					break loop01;
				}
			}
		}
        return answer;
    }
}