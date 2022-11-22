class Solution {
    public int[] solution(int n) {
        int[] answer;
        if(n % 2 != 0){
            answer = new int[(n / 2) + 1];
        } else {
            answer = new int[(n / 2)];
        }
        for(int j = 0; j < answer.length; j++) {
        	answer[j] = 2 * (j + 1) - 1;
        }
        return answer;
    }
}