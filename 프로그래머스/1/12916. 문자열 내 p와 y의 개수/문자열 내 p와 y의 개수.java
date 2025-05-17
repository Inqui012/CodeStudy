class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        
        for (char ch : s.toLowerCase().toCharArray()){
            if (ch == 'p') {
                p++;
            }
            if (ch == 'y') {
                y++;
            }
        }
        
        if(p == 0 && y == 0) {
            return true;
        } else if (p == y){
            return true;
        } else {
            return false;
        }
    }
}