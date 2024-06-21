import java.io.*;
import java.util.*;

public class BAEKJOON2961 {
	static int N, S, B, MIN = Integer.MAX_VALUE;
	static int[][] a;
	
	static void subs(int cnt, int s, int b) {
		if (cnt == N - 1) {
			MIN = Math.min(MIN, (Math.max(s, b)) - (Math.min(s, b)));
			return;
		}

		subs(cnt + 1, s * a[cnt + 1][0], b + a[cnt + 1][1]); // 선택
		subs(cnt + 1, s, b); // 비선택
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		a = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			subs(i, a[i][0], a[i][1]);			
		}
		System.out.println(MIN);
	}
}
