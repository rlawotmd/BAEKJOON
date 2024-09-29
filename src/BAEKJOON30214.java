import java.util.Scanner;

public class BAEKJOON30214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a * 2 < b) System.out.println("H");
        else System.out.println("E");
    }
}
