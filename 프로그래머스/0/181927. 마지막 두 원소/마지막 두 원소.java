import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];
        if(last > before) {
            answer[answer.length - 1] = last - before;
        } else {
            answer[answer.length - 1] = last * 2;
        }
        return answer;
    }
}