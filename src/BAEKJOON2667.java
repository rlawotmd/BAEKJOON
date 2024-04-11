import java.io.*;
import java.util.*;

public class BAEKJOON2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        boolean[][] vis = new boolean[n][n];
        ArrayList<Integer> al = new ArrayList<>();
        int[] ar_x = {1, 0, -1, 0};
        int[] ar_y = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
                if (arr[i][j] == 1) vis[i][j] = true;
                else vis[i][j] = false;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0 || !vis[i][j]) continue;
                count++;
                int size = 1;
                Stack<int[]> s = new Stack<>();
                s.push(new int[]{i, j});
                while (!s.isEmpty()) {
                    int[] loc = (s.pop());
                    int vis_x = loc[0];
                    int vis_y = loc[1];
                    vis[vis_x][vis_y] = false;

                    for (int k = 0; k < 4; k++) {
                        int loc_x = vis_x + ar_x[k];
                        int loc_y = vis_y + ar_y[k];
                        if (loc_x < 0 || loc_y < 0 || loc_x > n - 1 || loc_y > n - 1) continue;
                        if (arr[loc_x][loc_y] == 1 && vis[loc_x][loc_y]) {
                            s.push(new int[]{loc_x, loc_y});
                            size++;
                            vis[loc_x][loc_y] = false;
                        }

                    }
                }
                al.add(size);
            }
        }
        Collections.sort(al);
        System.out.println(count);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
