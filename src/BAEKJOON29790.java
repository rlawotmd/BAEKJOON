import java.util.Scanner;

public class BAEKJOON29790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        int l = sc.nextInt();
        if (n >= 1000 && (u >= 8000 || l >= 260)) System.out.println("Very Good");
        else if (n >= 1000) System.out.println("Good");
        else System.out.println("Bad");
    }
}
