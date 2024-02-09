import java.util.Scanner;

public class BAEKJOON5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int[] b = new int[6];
        int[] c = new int[6];

        for(int i = 0; i < 6; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < 6; i++)
            b[i] = sc.nextInt();
        for(int i = 0; i < 6; i++)
            c[i] = sc.nextInt();

        if (a[5] - a[2] < 0) {
            a[4] -= 1;
            a[5] += 60;
        } if (a[4] - a[1] < 0) {
            a[3] -= 1;
            a[4] += 60;
        }
        if (b[5] - b[2] < 0) {
            b[4] -= 1;
            b[5] += 60;
        }
        if (b[4] - b[1] < 0) {
            b[3] -= 1;
            b[4] += 60;
        }

        if (c[5] - c[2] < 0) {
            c[4] -= 1;
            c[5] += 60;
        }
        if (c[4] - c[1] < 0) {
            c[3] -= 1;
            c[4] += 60;
        }

        System.out.println((a[3] - a[0]) + " " + (a[4] - a[1]) + " " + (a[5] - a[2]));
        System.out.println((b[3] - b[0]) + " " + (b[4] - b[1]) + " " + (b[5] - b[2]));
        System.out.println((c[3] - c[0]) + " " + (c[4] - c[1]) + " " + (c[5] - c[2]));
    }
}
