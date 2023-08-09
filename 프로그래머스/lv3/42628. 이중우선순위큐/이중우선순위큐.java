import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String[] operations) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(String str : operations) { 
			if(str.contains("I")) {
				list.add(Integer.valueOf(str.substring(2)));
				continue;
			}
			if(list.isEmpty()) continue;
			if(Integer.valueOf(str.substring(2)) > 0) Collections.sort(list, Collections.reverseOrder());
			else Collections.sort(list);
			list.remove(0);
		}
		if(list.isEmpty()) return new int[] {0, 0};
		else {
			Collections.sort(list);
			return new int[] {list.get(list.size() - 1), list.get(0)};
		}
    }
}