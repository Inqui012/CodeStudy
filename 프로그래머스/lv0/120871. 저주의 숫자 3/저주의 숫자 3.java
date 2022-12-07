import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        int[] range = IntStream.rangeClosed(1, 100).toArray();
        for(int i = 0; i < range.length; i++) {
        	if((i + 1) % 3 == 0 && (i + 1) < range.length) {
        		for(int j = i; j < range.length; j++) {
        			range[j] += 1;
        		}
        	}
        }
        for(int i = 0; i < range.length; i++) {
        	while(range[i] % 3 == 0 || String.valueOf(range[i]).contains("3")) {
        		if((i + 1) < range.length && range[i] + 1 < range[i + 1]) {
        			range[i] += 1;
        		} else {
        			for(int j = i; j < range.length; j++) {
        				range[j] += 1;
        			}        			
        		}
        	}
        }   
        return range[n - 1];
    }
}