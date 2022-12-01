class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() / n;
		if(my_str.length() % n > 0) {
			length++;
		}
		String[] answer = new String[length];
		int arridx = 0;
		int tmpidx = 0;
		while(tmpidx < my_str.length()) {
			answer[arridx] = my_str.substring(tmpidx, Math.min(my_str.length(), tmpidx + n));
			arridx++;
			tmpidx += n;
		}
        return answer;
    }
}