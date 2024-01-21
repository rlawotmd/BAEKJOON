import java.util.Scanner;

public class BAEKJOON2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();
        int n = l * p;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println((a - n) + " " + (b - n) + " " + (c - n) + " " + (d - n) + " " + (e - n));
    }
}
