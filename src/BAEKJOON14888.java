import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON14888 {
	static int n;
	static int[] arr;
	static int[] oper;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	static void perm(int num, int p) {
		if (p == n) {
			max = Math.max(max,  num);
			min = Math.min(min,  num);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if (oper[i] > 0) {
				oper[i]--;
				switch (i) {
					case 0 :
						perm(num + arr[p], p + 1);
						break;
					case 1 :
						perm(num - arr[p], p + 1);
						break;
					case 2 :
						perm(num * arr[p], p + 1);
						break;
					case 3 :
						perm(num / arr[p], p + 1);
						break;
				}
				oper[i]++;
			}
			
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		oper = new int[4];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int p = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}

		perm(arr[0], 1);
		
		System.out.println(max + "\n" + min);
		
	}
}
