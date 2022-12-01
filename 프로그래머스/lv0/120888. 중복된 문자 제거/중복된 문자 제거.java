class Solution {
    public String solution(String my_string) {
        String answer = "";
        loop : for(char c : my_string.toCharArray()) {
        	for(char str : answer.toCharArray()) {
        		if(str == c) {
        			continue loop;
        		}
        	}
        	answer += String.valueOf(c);
        }
        return answer;
    }
}