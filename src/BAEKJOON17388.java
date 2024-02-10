import java.util.Scanner;

public class BAEKJOON17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 100;
        int a = sc.nextInt();
        sum += a;
        if(min > a) min = a;
        int b = sc.nextInt();
        sum += b;
        if(min > b) min = b;
        int c = sc.nextInt();
        sum += c;
        if(min > c) min = c;
        if(sum >= 100) System.out.println("OK");
        else if(a == min) System.out.println("Soongsil");
        else if(b == min) System.out.println("Korea");
        else System.out.println("Hanyang");
    }
}
