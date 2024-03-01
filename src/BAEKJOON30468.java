import java.util.Scanner;

public class BAEKJOON30468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int dex = sc.nextInt();
        int Int = sc.nextInt();
        int luk = sc.nextInt();
        int n = sc.nextInt();
        if (((n * 4) - (str + dex + Int + luk)) < 0) System.out.println(0);
        else System.out.println(((n * 4) - (str + dex + Int + luk)));
    }
}
