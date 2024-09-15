import java.util.Scanner;

public class BAEKJOON29863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        System.out.println( ((24 - b) + a) % 24 );
    }
}
