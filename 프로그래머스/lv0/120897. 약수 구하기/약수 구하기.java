import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i == n / i){
                    arr.add(i);
                } else {
                    arr.add(i);
                    arr.add(n / i);
                }
            }
        }
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}