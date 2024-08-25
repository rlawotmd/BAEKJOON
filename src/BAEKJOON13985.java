import java.util.Scanner;

public class BAEKJOON13985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = Integer.parseInt(String.valueOf(s.charAt(0)));
        int b = Integer.parseInt(String.valueOf(s.charAt(4)));
        int c = Integer.parseInt(String.valueOf(s.charAt(8)));
        if (a + b == c) System.out.println("YES");
        else System.out.println("NO");

    }
}
