class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code - 1; i < cipher.length(); i++){
            if((i + 1) % code == 0){
                answer += String.valueOf(cipher.charAt(i));
            }
        }
        return answer;
    }
}