import java.util.Scanner;

public class BAEKJOON18408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aCnt = 0;
        int bCnt = 0;
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (num == 1) aCnt++;
            else if (num == 2) bCnt++;
        }
        System.out.println(aCnt > bCnt ? 1 : 2);
    }
}
