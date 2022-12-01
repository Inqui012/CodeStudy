import java.util.*;
class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).filter(num -> Integer.parseInt(num) % 3 == 0 && !num.equals("0")).count();
    }
}