import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 45;
        for(int i = 0; i < numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}