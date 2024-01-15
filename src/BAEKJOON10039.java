import java.util.Scanner;

public class BAEKJOON10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        /*int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();*/
        int ans = 0;
        for(int i = 0; i < 5; i++) {
            if(arr[i] < 40) arr[i] = 40;
            ans += arr[i];
        }
        System.out.println((ans / 5));
    }
}
