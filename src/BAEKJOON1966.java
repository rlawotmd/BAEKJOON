import java.io.*;
import java.util.*;

public class BAEKJOON1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Queue<Integer> impo = new LinkedList<>();
            int[] impo_arr = new int[n];

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                impo.add(num);
                impo_arr[j] = num;
            }

            Arrays.sort(impo_arr);

            Queue<Integer> q = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                if (j == m)
                    q.add(1);
                else
                    q.add(0);
            }

            int count = 0;
            int point = n - 1;

            while (point >= 0) {
                if (impo_arr[point] == impo.peek()) {
                    impo.remove();
                    int check = q.remove();
                    count++;
                    point--;
                    if (check == 1) {
                        bw.write(count + "\n");
                        point = -1;
                    }
                } else {
                    impo.add(impo.remove());
                    q.add(q.remove());
                }
            }

        }
        bw.flush();
    }
}
