import java.util.ArrayList;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter,"");
        return answer;
    }
}