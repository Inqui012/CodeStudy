import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] answer = new char[a.length()];
        
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) <= 'Z') answer[i] = (char) (a.charAt(i) + 32);
            else answer[i] = (char) (a.charAt(i) - 32);
        }
        System.out.println(answer);
    }
}