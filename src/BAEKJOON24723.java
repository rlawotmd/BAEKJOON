import java.util.Scanner;

public class BAEKJOON24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 0; i < n; i++)
            ans = ans * 2;
        System.out.println(ans);
    }
}
