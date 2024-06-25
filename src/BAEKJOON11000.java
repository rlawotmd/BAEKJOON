import java.io.*;
import java.util.*;

public class BAEKJOON11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(a[0][1]);

        for (int i = 1; i < n; i++) {
            if (a[i][0] >= pq.peek()) pq.poll();

            pq.offer(a[i][1]);
        }
        System.out.println(pq.size());
    }
}

/*
* 3
2 3
3 5
1 4 ans : 2
* 8
1 8
9 16
3 7
8 10
10 14
5 6
6 11
11 12 ans : 3
* 3
999999999 1000000000
999999998 999999999
1 999999998 ans : 1
* 4
1 2
1 4
2 6
4 5 ans : 2*/