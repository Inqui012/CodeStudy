class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
		for(int i = 0; i < quiz.length; i++) {
			String[] tmpStr = quiz[i].split(" ");
			if(tmpStr[1].equals("+")) {
				if(Integer.parseInt(tmpStr[0]) + Integer.parseInt(tmpStr[2]) == Integer.parseInt(tmpStr[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			}
            if(tmpStr[1].equals("-")) {
				if(Integer.parseInt(tmpStr[0]) - Integer.parseInt(tmpStr[2]) == Integer.parseInt(tmpStr[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			}
		}
        return answer;
    }
}