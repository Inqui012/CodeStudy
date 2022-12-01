class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] t = my_string.split("[a-zA-Z]");
            for(String str : t) {
            	if(!str.equals("")) {
            		answer+= Integer.parseInt(str);			            		
            	}
		    }
        return answer;
    }
}