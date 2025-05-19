class Solution {
    public String[] solution(String[] names) {
        int group = names.length % 5 != 0 ? (names.length / 5) + 1 : names.length / 5;
        String[] answer = new String[group];
        for(int i = 0; i < answer.length; i++){
            answer[i] = names[i * 5];
        }
        return answer;
    }
}