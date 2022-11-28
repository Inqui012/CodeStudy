import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        char[] tmp = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z'){
                tmp[i] = Character.toLowerCase(my_string.charAt(i));
            } else {
                tmp[i] = my_string.charAt(i);
            }
        }
        Arrays.sort(tmp);
        String answer = "";
        for(int i = 0; i < tmp.length; i++){
            answer += String.valueOf(tmp[i]);
        }
        return answer;
    }
}