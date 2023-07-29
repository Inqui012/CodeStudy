import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> tmp = new ArrayList<>();          
        for(int idx = intervals[0][0]; idx <= intervals[0][1]; idx++){
            tmp.add(arr[idx]);
        };
        for(int idx = intervals[1][0]; idx <= intervals[1][1]; idx++){
            tmp.add(arr[idx]);
        };
        return tmp.stream().mapToInt(Integer::intValue).toArray();
    }
}