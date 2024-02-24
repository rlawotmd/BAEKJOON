import java.util.Scanner;

public class BAEKJOON2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score = 0;
        int sum = 0;
        int pro;
        for(int i = 0; i < n; i++) {
            pro = sc.nextInt();
            if (pro == 1) score++;
            else score = 0;
            sum += score;
        }
        System.out.println(sum);
    }
}
