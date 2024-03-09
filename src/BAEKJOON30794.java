import java.util.Scanner;
import java.util.StringTokenizer;

public class BAEKJOON30794 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        if(s.equals("perfect")) System.out.println(n * 1000);
        if(s.equals("great")) System.out.println(n * 600);
        if(s.equals("cool")) System.out.println(n * 400);
        if(s.equals("bad")) System.out.println(n * 200);
        if(s.equals("miss")) System.out.println(0);
    }
}
