import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                aList.add(numlist[i]);
            }
        }
        int[] answer = new int[aList.size()];
        for(int i = 0; i < aList.size(); i++){
            answer[i] = aList.get(i);
        }        
        return answer;
    }
}