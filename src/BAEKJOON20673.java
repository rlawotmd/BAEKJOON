import java.util.Scanner;

public class BAEKJOON20673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        long num = sc.nextLong();
        if (total <= 50 && num <= 10) System.out.println("White");
        else if (num > 30) System.out.println("Red");
        else System.out.println("Yellow");
    }
}
