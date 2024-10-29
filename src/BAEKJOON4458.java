import java.util.Scanner;

public class BAEKJOON4458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String upper = s.toUpperCase();
            char[] chars = s.toCharArray();
            chars[0] = upper.charAt(0);
            System.out.println(chars);
        }
    }
}
