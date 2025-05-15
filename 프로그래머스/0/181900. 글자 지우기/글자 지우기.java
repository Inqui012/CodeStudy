import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        char[] ch = my_string.toCharArray(); 
        for(int idx : indices){
            ch[idx] = ' ';
        }
        String answer = new String(ch);
        return answer.replaceAll(" ", "");
    }
}