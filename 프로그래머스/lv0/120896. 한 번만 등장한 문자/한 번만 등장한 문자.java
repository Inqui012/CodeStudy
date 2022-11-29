import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){           	
            for(int j = 0; j < s.length(); j++){      	
                if(s.charAt(i) == s.charAt(j) && i != j){
                    break;
                }
                if(j == s.length() - 1){
                    charArr[i] = s.charAt(i);
                }
            }
        }
        
        Arrays.sort(charArr);
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] != '\u0000'){
                answer += String.valueOf(charArr[i]);
            }
        }
        return answer;
    }
}