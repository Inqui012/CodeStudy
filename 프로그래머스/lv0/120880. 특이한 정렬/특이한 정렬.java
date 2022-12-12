import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Map.Entry;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numlist, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numlist.length; i++) {
        	map.put(numlist[i], Math.abs(n - numlist[i]));
        }
        int[] dist = map.entrySet().stream().mapToInt(entry -> entry.getValue()).toArray();
        Arrays.sort(dist);
        int[] answer = new int[numlist.length];
loop : for(int i = 0; i < dist.length; i++) {
        	for(Integer key : map.keySet()) {
        		if(Collections.frequency(map.values(), dist[i]) > 1) {
        			int val = dist[i];
        			int[] two = ((Stream<Entry<Integer, Integer>>) map.entrySet().stream().filter(entry -> entry.getValue().equals(val))).mapToInt(entry -> entry.getKey()).toArray();
        			if(two[0] > two[1]) {
        				answer[i] = two[0];
        				answer[i + 1] = two[1];
        				i++;
        				continue loop;
        			} else {
        				answer[i] = two[1];
        				answer[i + 1] = two[0];
        				i++;
        				continue loop;
        			}
        		} else {
        			if(map.get(key).equals(dist[i])) {
        				answer[i] = key;
        			}        			
        		}
        	}
        }
        return answer;
    }
}