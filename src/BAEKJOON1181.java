import java.io.*;
import java.util.*;

public class BAEKJOON1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }


        String[] new_arr2 = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(new_arr2, (o1, o2) ->
            o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length()
        );
//        String[] new_arr = Arrays.stream(arr).distinct().toArray(String[]::new);
//        Arrays.sort(new_arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() == o2.length()) {
//                    return o1.compareTo(o2);
//                } else {
//                    return o1.length() - o2.length();
//                }
//            }
//        });

        for (int i = 0; i < new_arr2.length; i++) {
            bw.write(new_arr2[i] + "\n");
        }

        bw.flush();

    }
}
