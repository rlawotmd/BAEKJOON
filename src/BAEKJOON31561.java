import java.util.Scanner;

public class BAEKJOON31561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n <= 30) System.out.println(n / 2);
        else {
            n = n - 30;
            System.out.println((n * 1.5) + 15);
        }
    }
}
