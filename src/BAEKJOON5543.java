import java.util.Scanner;

public class BAEKJOON5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 2000;
        int d = 2000;
        int n;
        for(int i = 0; i < 3; i++) {
            n = sc.nextInt();
            if(b > n) b = n;
        }
        n = 0;
        for(int i = 0; i < 2; i++) {
            n = sc.nextInt();
            if(d > n) d = n;
        }
        System.out.println((b + d - 50));
    }
}
