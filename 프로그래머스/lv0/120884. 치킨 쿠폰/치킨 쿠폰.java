class Solution {
    public int solution(int chicken) {
        int service = 0;
        int answer = 0;
        while(chicken >= 10) {
        	 service = chicken / 10;
        	 answer += service;
        	 chicken = (chicken % 10) + service;
        }
        return answer;
    }
}