import java.math.BigInteger;
class Solution {
	public static BigInteger factorial (int num){
		BigInteger calc = BigInteger.valueOf(1);
		for(int i = 1; i <= num; i++){
			calc = calc.multiply(BigInteger.valueOf(i)); 
		}
		return calc;
	}
	public static BigInteger solution(int balls, int share) {
		BigInteger n = factorial(balls);
		BigInteger m = factorial(share);
		BigInteger nm = factorial(balls - share);
		BigInteger answer = n.divide(m.multiply(nm));
		return answer;
	}
}