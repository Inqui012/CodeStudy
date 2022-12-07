import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[][] dots) {
		double[] x = new double[dots.length];
		double[] y = new double[dots.length];

		for(int i = 0; i < dots.length; i++) {
			x[i] = dots[i][0];
			y[i] = dots[i][1];			
		}
		
		if((y[0] - y[1]) / (x[0] - x[1]) == (y[2] - y[3]) / (x[2] - x[3]) ||
			(y[0] - y[2]) / (x[0] - x[2]) == (y[1] - y[3]) / (x[1] - x[3]) ||
			(y[0] - y[3]) / (x[0] - x[3]) == (y[1] - y[2]) / (x[1] - x[2])){
			return 1;
		}
		return 0;
    }
}