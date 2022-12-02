class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i = 1; i <= Math.max(sides[0], sides[1]); i++){
            if(Math.min(sides[0], sides[1]) + i > Math.max(sides[0], sides[1])){
                answer++;
            }
        }
        for(int i = Math.max(sides[0], sides[1]) + 1; i < sides[0] + sides[1]; i++){
            answer++;
        }
        return answer;
    }
}