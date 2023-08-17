import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> retire = new HashMap<>();
		for(String part : participant) {
			if(retire.containsKey(part)) retire.replace(part, retire.get(part) + 1);
			else retire.put(part, 1);
		}
		
		for(String comp : completion) {
			if(retire.containsKey(comp)) {
				if(retire.get(comp) == 1) retire.remove(comp);
				else retire.replace(comp, retire.get(comp) - 1);
			}
		}
        return retire.keySet().toString().replace("[", "").replace("]", "");
        
    }
}