import java.util.Scanner;

public class BAEKJOON1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a;
        while(true) {
            String s = sc.nextLine();
            if(s.trim().equals("#")) System.exit(0);
            n = s.length();
            s = s.replace("a", "");
            s = s.replace("e", "");
            s = s.replace("i", "");
            s = s.replace("o", "");
            s = s.replace("u", "");
            s = s.replace("A", "");
            s = s.replace("E", "");
            s = s.replace("I", "");
            s = s.replace("O", "");
            s = s.replace("U", "");
            a = s.length();
            System.out.println((n - a));
        }
    }
}
