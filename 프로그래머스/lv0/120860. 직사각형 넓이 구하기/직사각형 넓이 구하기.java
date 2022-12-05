
class Solution {
    public static int getLength(int[] line) {
		if(line[0] < 0 ^ line[1] < 0) {
			return Math.abs(line[0]) + Math.abs(line[1]);
		} else {
			return Math.abs(Math.max(line[0], line[1]) - Math.min(line[0], line[1]));
		}
	}
    public int solution(int[][] dots) {
		int[] x = {dots[0][0], 0};
		int[] y = {dots[0][1], 0};
		
		for(int[] i : dots) {
			if(x[0] != i[0]) {
				x[1] = i[0];
			}
			if(y[0] != i[1]) {
				y[1] = i[1];
			}
		}
        return getLength(x) * getLength(y);
    }
}