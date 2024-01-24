import java.util.Scanner;

public class BAEKJOON5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int kor = a / c;
        int math = b / d;
        if(a % c > 0) kor++;
        if(b % d > 0) math++;
        if(kor > math) System.out.println((l - kor));
        else System.out.println((l - math));
    }
}
