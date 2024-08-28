import java.util.Scanner;

public class BAEKJOON26068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int ans = n;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int c = Integer.parseInt(s.substring(2));
            if (c > 90) ans--;
        }
        System.out.println(ans);
    }
}
