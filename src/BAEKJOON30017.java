import java.util.Scanner;

public class BAEKJOON30017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= b) b = a - 1;
        if (a - 1 > b) a = b + 1;

        System.out.println(a + b);

    }
}
