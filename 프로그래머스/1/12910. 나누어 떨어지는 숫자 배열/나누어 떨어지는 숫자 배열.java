import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList();
        Arrays.sort(arr);
        for(int i : arr) {
            if(i % divisor == 0){
                list.add(i);
            }
        }
        if(list.size() < 1) {
            return new int[] {-1};
        }
        int[] ans = new int[list.size()];
        for(int j = 0; j < ans.length; j++){
            ans[j] = list.get(j).intValue();
        }
        return ans;
    }
}