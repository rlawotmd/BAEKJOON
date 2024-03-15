import java.util.Scanner;

public class BAEKJOON30501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        for(int i = 0; i <= n; i++) {
            String s = sc.nextLine();

            if(s.contains("S")) ans = s;
        }
        System.out.println(ans);
    }
}
