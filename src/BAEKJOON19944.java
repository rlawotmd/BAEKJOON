import java.util.Scanner;

public class BAEKJOON19944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 1 || m == 2) System.out.println("NEWBIE!");
        else if (n >= m) System.out.println("OLDBIE!");
        else System.out.println("TLE!");
    }
}
