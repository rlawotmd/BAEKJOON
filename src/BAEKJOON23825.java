import java.util.Scanner;

public class BAEKJOON23825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Math.min(n / 2, m / 2));
    }
}
