import java.util.Scanner;

public class BAEKJOON25642 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        while (n < 5 || m < 5) {
            if (cnt % 2 == 0) {
                m += n;
            }
            else {
                n += m;
            }
            cnt++;
        }
        if (cnt % 2 == 0) {
            System.out.println("yt");
        }
        else {
            System.out.println("yj");
        }
    }
}
