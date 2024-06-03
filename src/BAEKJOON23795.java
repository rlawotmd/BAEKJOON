import java.util.Scanner;

public class BAEKJOON23795 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        while (n != -1) {
            sum += n;
            n = sc.nextInt();
        }
        System.out.println(sum);
    }
}
