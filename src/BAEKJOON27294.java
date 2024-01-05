import java.util.Scanner;

public class BAEKJOON27294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        if(s == 1) {
            System.out.println(280);
            System.exit(0);
        }
        if(t >= 12 && t <= 16) {
            System.out.println(320);
        }
        else System.out.println(280);

    }
}
