import java.util.Scanner;

public class BAEKJOON5717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0) System.exit(0);
            System.out.println((a + b));
        }
    }
}
