class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String C = "";
        if(!A.equals(B)) {
        	while(!C.equals(B)) {
        		C = String.valueOf(A.charAt(A.length() - 1));
        		for(int i = 0; i < A.length() - 1; i++) {
        			C += String.valueOf(A.charAt(i));
        		}
        		answer++;
        		A = C.toString();
        		if(answer > A.length()) {
        			answer = -1;
        			break;
        		}
        	}        		
        }
        return answer;
    }
}