class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 2 * k - 1;
        while(answer > numbers.length){
            answer = answer % numbers.length;
        }  
        return answer;
    }
}