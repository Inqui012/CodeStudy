import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 1){
            for(int i = 2; i <= n; i++){      	
                if(n % i == 0){
                    n /= i;
                    if(arr.contains(i)){
                    	i = 1;
                        continue;
                    }
                    arr.add(i);
                    i = 1;
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