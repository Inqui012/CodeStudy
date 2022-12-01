import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
		ArrayList<String> be = new ArrayList<>(Arrays.asList(before.split("")));
		ArrayList<String> af = new ArrayList<>(Arrays.asList(after.split("")));
		for(char c : before.toCharArray()) {
			be.remove(String.valueOf(c));
			af.remove(String.valueOf(c));
		}
		if(be.size() == 0 && af.size() == 0) {
			answer = 1;
		} 
        return answer;
    }
}