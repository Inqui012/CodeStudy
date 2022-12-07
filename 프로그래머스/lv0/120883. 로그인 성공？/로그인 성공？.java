class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] list : db){
            if(id_pw[0].equals(list[0]) && id_pw[1].equals(list[1])){
                answer = "login";
                break;
            } else if (id_pw[0].equals(list[0]) && !id_pw[1].equals(list[1])){
                answer = "wrong pw";
                break;
            }
        }
        return answer;
    }
}