import java.io.*;
import java.util.Arrays;

public class BAEKJOON2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int[] real = new int[n];
        int min = 4001;
        int max = -4001;
        int sum = 0;
        int cout = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num + 4000] += 1;
            real[i] = num;
            if (min > num) min = num;
            if (max < num) max = num;
            if (cout < arr[num + 4000]) cout = arr[num + 4000];
            sum += num;
        }

        int range;
        if (min < 0) range = max + (min * -1);
        else range = max - min;

        sum = (int) Math.round((double) sum / n);
        bw.write(sum + "\n");

        Arrays.sort(real);

        bw.write(real[n / 2] + "\n");

        int f = -1;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            if (cout == arr[i] && check) {
                f = i;
                break;
            }
            if (cout == arr[i]) {
                f = i;
                check = true;
            }
        }
        bw.write(f - 4000 + "\n");
        bw.write(range + "");
        bw.flush();

    }
}
