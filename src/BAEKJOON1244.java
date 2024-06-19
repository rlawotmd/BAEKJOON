package a0619.recu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON1244 {
	
	static int[] arr;
	
	static void man(int num) {
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % num == 0) {
				if (arr[i] == 0) arr[i] = 1;
				else arr[i] = 0;
			}
		}
	}
	
	static void woman(int num) {
		if (arr[num - 1] == 0) arr[num - 1] = 1;
		else arr[num - 1] = 0;
		int prev = num - 1;
		int next = num - 1;
		while (true) {
			if (prev < 0 || next >= arr.length) {
				prev++;
				next--;
				break;
			}
			if (arr[prev] != arr[next]) break;
			if (arr[prev] == 0) arr[prev] = 1;
			else arr[prev] = 0;
			if (arr[next] == 0) arr[next] = 1;
			else arr[next] = 0;
			prev--;
			next++;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int sex = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			if (sex == 1) man(num);
			if (sex == 2) woman(num);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && i % 20 == 0) bw.write("\n");
			bw.write(arr[i] + " ");
		}
		bw.flush();
	}
}
