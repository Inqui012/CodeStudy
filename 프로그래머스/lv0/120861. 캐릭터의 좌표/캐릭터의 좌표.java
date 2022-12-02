class Solution {
    public int[] solution(String[] keyinput, int[] board) {
	    int[] answer = {0, 0};
		for (String key : keyinput) {
			switch (key) {
			case "left":
                    answer[0]--;
                    if(answer[0] < -1 * (board[0] - 1) / 2){
                        answer[0] = -1 * (board[0] - 1) / 2;
                    }
				break;
			case "right":
                    answer[0]++;
                    if(answer[0] > (board[0] - 1) / 2){
                        answer[0] = (board[0] - 1) / 2;
                    }
				break;
			case "up":
                    answer[1]++;
                    if(answer[1] > (board[1] - 1) / 2){
                        answer[1] = (board[1] - 1) / 2;
                    }
				break;
			case "down":
                    answer[1]--;
                    if(answer[1] < -1 * (board[1] - 1) / 2){
                        answer[1] = -1 * (board[1] - 1) / 2;
                    }
				break;
			}
		}
        return answer;
    }
}