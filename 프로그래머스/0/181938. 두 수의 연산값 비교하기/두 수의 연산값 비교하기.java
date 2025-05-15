class Solution {
    public int solution(int a, int b) {
        int tmp = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        if(tmp >= 2*a*b) {
            return tmp;
        } else {
            return 2*a*b; 
        }
    }
}