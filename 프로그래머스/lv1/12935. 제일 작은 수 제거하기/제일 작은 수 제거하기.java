import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
			return new int[]{-1};
		} else {
			int[] copy = arr.clone();
			Arrays.sort(copy);
			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
			int minidx = list.indexOf(copy[0]);
			list.remove(minidx);
			return list.stream().mapToInt(e -> e).toArray();
		}
    }
}