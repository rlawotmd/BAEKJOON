import java.util.Scanner;

public class BAEKJOON11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int is = 100;
        int[] a = new int[4];
        for(int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if(is > a[i]) is = a[i];
        }
        sum -= is;
        int e = sc.nextInt();
        int f = sc.nextInt();
        if(e > f) sum += e;
        else sum += f;
        System.out.println(sum);
    }
}
