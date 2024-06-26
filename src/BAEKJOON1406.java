import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BAEKJOON1406 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

//        LinkedList<Character> l = new LinkedList<>();
//        ListIterator<Character> li = l.listIterator();
        ArrayDeque<Character> left = new ArrayDeque<>();
        ArrayDeque<Character> right = new ArrayDeque<>();

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
//            li.add(str.charAt(i));
            left.push(s.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());
//        int p = l.size();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            s = st.nextToken();
            if (st.hasMoreTokens()) {
//                l.add(p++, st.nextToken().charAt(0));
                left.push(st.nextToken().charAt(0));
            } else {
                if (s.equals("L")) {
//                    if (p == 0) continue;
//                    p--;
                    if (left.isEmpty()) continue;
                    right.push(left.pop());
                }
                else if (s.equals("D")) {
//                    if (p == l.size()) continue;
////                    p++;
                    if (right.isEmpty()) continue;
                    left.push(right.pop());
                }
                else if (s.equals("B")) {
//                    if (p == 0) continue;
//                    l.remove(--p);
                    if (left.isEmpty()) continue;
                    left.pop();
                }
            }
        }

//        for (Character c : l) {
//            bw.write(c);
//        }

        while (!left.isEmpty()) {
            bw.write(left.pollLast());
        }
//        bw.write("\n");
        while (!right.isEmpty()) {
            bw.write(right.pop());
        }
        bw.flush();

    }
}
