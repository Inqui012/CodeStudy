import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
//	효율성 고려없이 정답만 찾은경우
//      for(String part : participant) {
//			if(!Arrays.asList(completion).contains(part) || Collections.frequency(Arrays.asList(participant), part) != Collections.frequency(Arrays.asList(completion), part)) {
//				answer = part;
//			}
//		}
        HashMap<String, Integer> retire = new HashMap<>();
		for(String part : participant) {
//			Collections 돌아가는게 시간을 꽤 잡아먹나보네...
//			retire.put(part, Collections.frequency(Arrays.asList(participant), part));
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
