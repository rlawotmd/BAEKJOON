import java.util.Scanner;

public class BAEKJOON20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans1 = n * 78 / 100;
        int ans2 = n - ((n / 5) * 22 / 100);
        System.out.println(ans1 + " " + ans2);
    }
}
