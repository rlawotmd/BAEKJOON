import java.util.Scanner;

public class BAEKJOON32369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = 1;
        int B = 1;
        for (int i = 0; i < n; i++) {
            A += a;
            B += b;
            if (A < B) {
                int temp = A;
                A = B;
                B = temp;
            }
            if (A == B) B--;
        }

        System.out.println(A + " " + B);
    }
}
