class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = idx; i <= arr.length - 1; i++){
            if(arr[i] == 0){
                answer++;
            } else {
                return answer + idx;
            }
        }
        return -1;
    }
}