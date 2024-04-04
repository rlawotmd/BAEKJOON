import java.util.Scanner;
import java.util.Stack;

public class BAEKJOON10773 {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num == 0) stack.pop();
            else stack.push(num);
        }

        int sum = 0;

        for (int i = 0; i < stack.size(); i++) {
            sum += stack.elementAt(i);
        }

        System.out.println(sum);
    }
}
