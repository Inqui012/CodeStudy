import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arrS = s.split(" ");
        ArrayList<String> arrLS = new ArrayList<>();
        for(int i = 0; i < arrS.length; i++) {
        		arrLS.add(arrS[i]);        		
        }
        
        for(int i = 0; i < arrLS.size(); i++) {
        	if(arrLS.get(i).equals("Z")) {
        		arrLS.remove(i);
        		if(i != 0) {
        			arrLS.remove(i - 1);
        			i = -1;
        		}
        		i = -1;
        	}
        }
        for(int i = 0; i < arrLS.size(); i++) {
        	answer += Integer.parseInt(arrLS.get(i));
        }
        return answer;
    }
}