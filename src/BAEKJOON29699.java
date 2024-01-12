import java.util.Scanner;

public class BAEKJOON29699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String("WelcomeToSMUPC");
        int n = sc.nextInt();
        if (n % 14 == 0) System.out.println("C");
        else System.out.println(s.charAt((n % 14) - 1));
    }
}
