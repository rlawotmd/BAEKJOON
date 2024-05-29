import java.util.Scanner;

public class BAEKJOON5341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

            if(n == 0){
                break;
            }

            int answer = n * (n + 1) / 2;
            System.out.println(answer);
        }
    }
}