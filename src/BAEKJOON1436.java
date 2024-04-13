import java.util.Scanner;

public class BAEKJOON1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int num = 660;
        
        for (int i = 0; i < n; i++) {
            while (true) {
                num++;
                String s = String.valueOf(num);
                for (int j = 1; j < s.length() - 1; j++) {
                    if (s.charAt(j - 1) == '6' && s.charAt(j) == '6' && s.charAt(j + 1) == '6') {
                        ans = num;
                        break;
                    }
                }
                if (num == ans) break;
            }
        }
        System.out.println(ans);
    }
}
