import java.util.Scanner;

public class BAEKJOON21312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int m = 1;
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) n *= num;
            else m *= num;
        }
        if (m == 1) System.out.println(n);
        else System.out.println(m);
    }
}
