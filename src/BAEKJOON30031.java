import java.util.Scanner;

public class BAEKJOON30031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int x = sc.nextInt();
            if (m == 136) sum += 1000;
            if (m == 142) sum += 5000;
            if (m == 148) sum += 10000;
            if (m == 154) sum += 50000;
        }
        System.out.println(sum);
    }
}
