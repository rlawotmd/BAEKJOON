import java.util.Scanner;

public class BAEKJOON27959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(((n * 100) >= m) ? "Yes" : "No");
    }
}
