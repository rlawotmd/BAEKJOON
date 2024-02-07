import java.util.Scanner;

public class BAEKJOON10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 2) System.out.println("Before");
        else if (n > 2) System.out.println("After");
        else if (m > 18) System.out.println("After");
        else if (m < 18) System.out.println("Before");
        else System.out.println("Special");
    }
}
