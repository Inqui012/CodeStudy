class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i : array){
            if(Math.abs(i - n) < Math.abs(answer - n)){
                answer = i;
            } else if (Math.abs(i - n) == Math.abs(answer - n)){
                answer = Math.min(i, answer);
            }
        }
        return answer;
    }
}