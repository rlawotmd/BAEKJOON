import java.util.Scanner;

public class BAEKJOON9085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int sum;
        for(int i = 0; i < t; i++) {
            n = sc.nextInt();
            sum = 0;
            for(int j = 0; j < n; j++) {
                sum = sum + sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
