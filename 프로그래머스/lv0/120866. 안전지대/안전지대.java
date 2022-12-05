import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int[][] boardCopy = new int[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					if(i - 1 >= 0) {
						boardCopy[i - 1][j] = 9;
						if(j - 1 >= 0) {
							boardCopy[i - 1][j - 1] = 9;							
						}
						if(j + 1 < board[i].length) {
							boardCopy[i - 1][j + 1] = 9;													
						}
					}
					boardCopy[i][j] = 9;
					if(j - 1 >= 0) {
						boardCopy[i][j - 1] = 9;
					}
					if(j + 1 < board[i].length) {
						boardCopy[i][j + 1] = 9;
					}
					if(i + 1 < board.length) {
						boardCopy[i + 1][j] = 9;
						if(j - 1 >= 0) {
							boardCopy[i + 1][j - 1] = 9;							
						}
						if(j + 1 < board[i].length) {
							boardCopy[i + 1][j + 1] = 9;													
						}
					}
				}
			}
		}
        return (int) Arrays.stream(boardCopy).flatMapToInt(line -> Arrays.stream(line)).filter(num -> num == 0).count();
    }
}