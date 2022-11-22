class Solution {
    public int solution(int[] common) {
		int gap = common[1] - common[0];
		int answer = common[common.length - 1] + gap; 
        if(common[1] - common[0] != common[2] - common[1]){
        	gap = common[1] / common[0];
        	answer = common[common.length - 1] * gap;        
        }
        return answer;
    }
}