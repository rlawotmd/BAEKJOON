import java.util.Scanner;

public class BAEKJOON8558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 0) System.out.println(1);
        else if (n == 2) System.out.println(2);
        else if (n == 3) System.out.println(6);
        else if (n == 4) System.out.println(4);
        else System.out.println(0);

    }
}
