import java.util.Scanner;

public class BAEKJOON31611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 7 == 2) System.out.println(1);
        else System.out.println(0);
    }
}
