import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i <= strArr.length - 1; i++) {
            if ((i+1)%2 == 0) {
                ans.add(strArr[i].toUpperCase());
            } else {
                ans.add(strArr[i].toLowerCase());
            }
        }
        return ans.toArray(new String[0]);
    }
}