import java.util.Scanner;

public class BAEKJOON10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a + b + c) != 180) System.out.println("Error");
        else if(a == 60 && b == 60) System.out.println("Equilateral");
        else if(a == b || b == c || a == c) System.out.println("Isosceles");
        else System.out.println("Scalene");
    }
}
