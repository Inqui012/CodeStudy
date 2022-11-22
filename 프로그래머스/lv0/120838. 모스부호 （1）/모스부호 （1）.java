class Solution {
    public String solution(String letter) {
		String answer = "";
		String[] alp = letter.split(" ");
		for (int i = 0; i < alp.length; i++) {
			if (alp[i].equals(".-")) {
				answer += "a";
				continue;
			}
			if (alp[i].equals("-...")) {
				answer += "b";
				continue;
			}
			if (alp[i].equals("-.-.")) {
				answer += "c";
				continue;
			}
			if (alp[i].equals("-..")) {
				answer += "d";
				continue;
			}
			if (alp[i].equals(".")) {
				answer += "e";
				continue;
			}
			if (alp[i].equals("..-.")) {
				answer += "f";
				continue;
			}
			if (alp[i].equals("--.")) {
				answer += "g";
				continue;
			}
			if (alp[i].equals("....")) {
				answer += "h";
				continue;
			}
			if (alp[i].equals("..")) {
				answer += "i";
				continue;
			}
			if (alp[i].equals(".---")) {
				answer += "j";
				continue;
			}
			if (alp[i].equals("-.-")) {
				answer += "k";
				continue;
			}
			if (alp[i].equals(".-..")) {
				answer += "l";
				continue;
			}
			if (alp[i].equals("--")) {
				answer += "m";
				continue;
			}
			if (alp[i].equals("-.")) {
				answer += "n";
				continue;
			}
			if (alp[i].equals("---")) {
				answer += "o";
				continue;
			}
			if (alp[i].equals(".--.")) {
				answer += "p";
				continue;
			}
			if (alp[i].equals("--.-")) {
				answer += "q";
				continue;
			}
			if (alp[i].equals(".-.")) {
				answer += "r";
				continue;
			}
			if (alp[i].equals("...")) {
				answer += "s";
				continue;
			}
			if (alp[i].equals("-")) {
				answer += "t";
				continue;
			}
			if (alp[i].equals("..-")) {
				answer += "u";
				continue;
			}
			if (alp[i].equals("...-")) {
				answer += "v";
				continue;
			}
			if (alp[i].equals(".--")) {
				answer += "w";
				continue;
			}
			if (alp[i].equals("-..-")) {
				answer += "x";
				continue;
			}
			if (alp[i].equals("-.--")) {
				answer += "y";
				continue;
			}
			if (alp[i].equals("--..")) {
				answer += "z";
				continue;
			}
		}
        return answer;
    }
}