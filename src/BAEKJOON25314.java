import java.util.Scanner;

public class BAEKJOON25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n / 4;
        String s = "";
        for(int i = 0; i < n; i++) {
            s = s + "long ";
        }
        s = s + "int";
        System.out.println(s);
    }
}
