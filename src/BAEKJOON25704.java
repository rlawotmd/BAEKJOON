import java.util.Scanner;

public class BAEKJOON25704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int dis = 0;
        if (n >= 5) dis = Math.max(dis, 500);
        if (n >= 10) dis = Math.max(dis, p / 10);
        if (n >= 15) dis = Math.max(dis, 2000);
        if (n >= 20) dis = Math.max(dis, p / 4);

        int ans = p - dis;
        if (ans > 0) System.out.println(ans);
        else System.out.println(0);
    }
}
