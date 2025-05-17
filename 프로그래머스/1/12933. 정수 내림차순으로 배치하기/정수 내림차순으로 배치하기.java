import java.util.*;
class Solution {
    public long solution(long n) {
        String str = "";
        char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr);
        
        for (int i = arr.length - 1; i >= 0; i--){
            str += arr[i];
        }
        return Long.valueOf(str);
        
    }
}