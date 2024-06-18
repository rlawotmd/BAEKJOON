import java.util.Scanner;

public class BAEKJOON27494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] check = {'2', '0', '2', '3'};
        if (n < 2023) {
            System.out.println(0);
            System.exit(0);
        }

        int point = 0;
        int ans = 0;

        for (int i = 2023; i <= n; i++) {
            point = 0;
            String s = String.valueOf(i);
            char[] arr = s.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == check[point]) {
                    point++;
                }
                if (point == 4) {
                    ans++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
