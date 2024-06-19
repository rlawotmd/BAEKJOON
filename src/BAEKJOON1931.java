import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1, o2) ->
			o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
		
//		for (int[] a : arr) System.out.println(Arrays.toString(a));
		
		int ans = 0;
		int prev_time = 0;
		
		for (int i = 0; i < n; i++) {
			if (prev_time <= arr[i][0]) {
				prev_time = arr[i][1];
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
