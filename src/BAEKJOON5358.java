import java.io.*;
import java.util.Scanner;

public class BAEKJOON5358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'i') arr[i] = 'e';
                else if (arr[i] == 'I') arr[i] = 'E';
                else if (arr[i] == 'e') arr[i] = 'i';
                else if (arr[i] == 'E') arr[i] = 'I';
            }
            System.out.println(String.valueOf(arr));
        }
    }
}
