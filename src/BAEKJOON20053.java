import java.util.Scanner;

public class BAEKJOON20053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int min = 1000000;
            int max = -1000000;
            for (int j = 0; j < num; j++) {
                int input = sc.nextInt();
                min = Math.min(min, input);
                max = Math.max(max, input);
            }
            System.out.println(min + " " + max);
        }
    }
}
