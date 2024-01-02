import java.util.Scanner;

public class BAEKJOON15727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int t = L / 5;
        if(L % 5 != 0) t++;
        System.out.println(t);
    }
}
