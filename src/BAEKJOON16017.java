import java.util.Scanner;

public class BAEKJOON16017 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[0] < 8 || arr[3] < 8) System.out.println("answer");
        else if(arr[1] != arr[2]) System.out.println("answer");
        else System.out.println("ignore");
    }
}