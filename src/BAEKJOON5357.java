import java.util.Scanner;

public class BAEKJOON5357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(j - 1)) sb.append(s.charAt(j));
            }
            System.out.println(sb);
        }
    }
}
