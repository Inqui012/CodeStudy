class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
		int xnum = 0;
		for(String str : polynomial.split(" \\+ ")) {
			try {
				num += Integer.parseInt(str);
			} catch (Exception e) {
				if(str.length() == 1) {
					xnum += Integer.parseInt(str.replaceAll("x", "1"));										
				} else {
					xnum += Integer.parseInt(str.replaceAll("x", ""));					
				}
			}
		}
        if(xnum > 1) {
        	if(num > 0) {
        		answer = xnum + "x + " + num;        		
        	} else {
        		answer = xnum + "x";        		        		
        	}
        } else if (xnum == 1) {
        	if(num > 0) {
        		answer = "x + " + num;        		
        	} else {
        		answer = "x";        		        		
        	}
        } else {
        	answer = String.valueOf(num);
        }
        return answer;
    }
}