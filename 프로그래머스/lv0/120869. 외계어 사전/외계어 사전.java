import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        for(String dicStr : dic){
            String[] tmp = dicStr.split("");
            Arrays.sort(tmp);
            if(Arrays.equals(spell, tmp)){
                answer = 1;
            }
        }
        return answer;
    }
}