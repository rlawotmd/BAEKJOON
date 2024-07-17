import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BAEKJOON24479 {
    static ArrayList<Integer>[] arr;
    static int[] rest;
    static int n, m, k, idx = 1;

    static void DFS(int start) {
        rest[start] = idx++;
        for (int i : arr[start]) {
            if (rest[i] == 0) DFS(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        rest = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        DFS(k);

        for (int i = 1; i <= n; i++) {
            bw.write(rest[i] + "\n");
        }

        bw.flush();
    }
}
/*
4 3 4
1 4
3 4
2 4
ans : 2 3 4 1
 */
