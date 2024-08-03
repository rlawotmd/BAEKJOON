import java.util.Scanner;

public class BAEKJOON27219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        int n = sc.nextInt();
        for (int i = 0; i < n / 5; i++) sb.append("V");
        for (int i = 0; i < n % 5; i++) sb.append("I");
        System.out.println(sb);
    }
}
