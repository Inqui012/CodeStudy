class Solution {
    public String solution(int age) {
        String strAge = Integer.toString(age);
        String answer = "";
        for (int i = 0; i < strAge.length(); i++){
            answer += Character.toString((char) (strAge.charAt(i) + 49));
        }
        return answer;
    }
}