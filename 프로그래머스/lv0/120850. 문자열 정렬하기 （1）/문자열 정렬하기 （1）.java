import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        int[] answer = new int[my_string.length()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Character.getNumericValue(my_string.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}