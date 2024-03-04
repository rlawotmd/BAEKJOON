import java.util.*;

public class BAEKJOON19698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
        if (((w / l) * (h / l)) < n) System.out.println(((w / l) * (h / l)));
        else System.out.println(n);
    }
}
