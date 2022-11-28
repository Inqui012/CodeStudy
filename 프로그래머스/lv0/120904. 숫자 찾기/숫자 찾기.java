class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = String.valueOf(num);
        for(int i = 0; i < numStr.length(); i++){
            if(numStr.charAt(i) - 48 == k){
                answer = i + 1;
                break;
            } else {
                answer = -1;   
            }
        }
        return answer;
    }
}