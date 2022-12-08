import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[][] lines) {
        ArrayList<String> lineall = new ArrayList<>();
        for(int[] line : lines) {
        	for(int j = Math.min(line[0], line[1]); j < Math.max(line[0], line[1]); j++) {
        		lineall.add(new String(j + ", " + (j + 1)));
        	}
        }
        return lineall.stream().filter(i -> Collections.frequency(lineall, i) > 1).collect(Collectors.toSet()).size();
    }
}