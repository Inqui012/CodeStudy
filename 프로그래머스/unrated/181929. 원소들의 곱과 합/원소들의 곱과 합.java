class Solution {
    public int solution(int[] num_list) {
        int mult = 1;
        int sub = 0;
        
        for(int i = 0; i < num_list.length; i++){
            mult *= num_list[i];
            sub += num_list[i];
        }
        return mult < (sub*sub) ?  1 : 0;
    }
}