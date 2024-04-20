import java.io.*;
import java.util.Arrays;

public class BAEKJOON2751_1 {
    static int[] mergesort(int[] arr) {
        return divide(arr, 0, arr.length);
    }

    static int[] divide(int[] arr, int start, int end) {
        if (end < 2 || start >= end) return arr;
        int[] front_arr = Arrays.copyOfRange(arr, start, end / 2);
        int[] back_arr = Arrays.copyOfRange(arr, end / 2, end);

        front_arr = divide(front_arr, 0, front_arr.length);
        back_arr = divide(back_arr, 0, back_arr.length);

        int[] result = merge(front_arr, back_arr);

        return result;
    }

    static int[] merge(int[] front_arr, int[] back_arr) {
        int[] result = new int[front_arr.length + back_arr.length];
        int front_point = 0;
        int back_point = 0;
        int point = 0;
        while (front_point < front_arr.length && back_point < back_arr.length) {
            if (front_arr[front_point] <= back_arr[back_point]) {
                result[point++] = front_arr[front_point++];
                continue;
            }
            if (front_arr[front_point] >= back_arr[back_point]) {
                result[point++] = back_arr[back_point++];
            }
        }

        for (; point < result.length; point++) {
            if (front_point == front_arr.length) {
                result[point] = back_arr[back_point++];
                continue;
            }
            if (back_point == back_arr.length) {
                result[point] = front_arr[front_point++];
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        arr = mergesort(arr);

        for (int j : arr) bw.write(j + "\n");
        bw.flush();
    }
}
