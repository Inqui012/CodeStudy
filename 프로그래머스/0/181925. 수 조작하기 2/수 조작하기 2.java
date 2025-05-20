class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int calc = 0;
        for(int i = 1; i < numLog.length; i++){
            calc = numLog[i - 1] - numLog[i];
            if(calc == 1) {
                answer += "s";
            } else if (calc == -1) {
                answer += "w";
            } else if (calc == 10) {
                answer += "a";
            } else {
                answer += "d";
            }
        }
        return answer;
    }
}