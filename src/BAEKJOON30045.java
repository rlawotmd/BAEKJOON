import java.util.Scanner;

public class BAEKJOON30045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            if(s.contains("01") || s.contains("OI")) cnt++;
        }
        System.out.println(cnt);
    }
}
