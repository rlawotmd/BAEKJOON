import java.util.Scanner;

public class BAEKJOON31495 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char zero = s.charAt(0);
        char fin = s.charAt(s.length() - 1);
        if(zero == '"' && fin == '"' && s.length() > 2) System.out.println(s.substring(1, s.length() - 1));
        else System.out.println("CE");
    }
}
