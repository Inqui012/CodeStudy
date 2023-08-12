import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int N, int[] stages) {
        List<Integer> stgList = Arrays.stream(stages).boxed().collect(Collectors.toList());
		Map<Integer, Double> stgMap = new HashMap<>();
		
		for(int i = 1; i <= N + 1; i++) {
			int clear = 0;
			int unClear = Collections.frequency(stgList, i);
			for(int e : stages) {
				if(e >= i) clear++;
			}
			if(unClear == 0) stgMap.put(i, 0.0);
			else stgMap.put(i, (double) unClear / clear);
		}
		stgMap.remove(N + 1);
		List<Integer> sortStg = new ArrayList<>(stgMap.keySet());
		sortStg.sort((e1, e2) -> stgMap.get(e2).compareTo(stgMap.get(e1)));
        return sortStg.stream().mapToInt(stg -> stg).toArray();
    }
}