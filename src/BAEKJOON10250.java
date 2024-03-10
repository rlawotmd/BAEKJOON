import java.util.Scanner;

public class BAEKJOON10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int h, w, n;
        for(int i = 0; i < m; i++) {
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();
            if(n % h == 0) {
                System.out.print(h);
                if(n / h >= 10) System.out.println(n / h);
                else System.out.println("0" + (n / h));
            }
            else {
                System.out.print(n % h);
                if(n / h + 1 >= 10) System.out.println(n / h + 1);
                else System.out.println("0" + (n / h + 1));
            }
        }
    }
}
