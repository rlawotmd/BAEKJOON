import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class BAEKJOON23805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String AT = "@";
        String SPACE = " ";
        StringBuilder sb = new StringBuilder();

        String atHorizontalStroke = AT.repeat(n * 3);
        String atVerticalStroke = AT.repeat(n);
        String spaceVerticalStroke = SPACE.repeat(n);

        IntStream.range(0, n).forEach(i -> sb
                .append(atHorizontalStroke)
                .append(spaceVerticalStroke)
                .append(atVerticalStroke)
                .append("\n"));

        IntStream.range(0, n * 3).forEach(i -> sb
                .append(atVerticalStroke)
                .append(spaceVerticalStroke)
                .append(atVerticalStroke)
                .append(spaceVerticalStroke)
                .append(atVerticalStroke)
                .append("\n"));


        IntStream.range(0, n).forEach(i -> sb
                .append(atVerticalStroke)
                .append(spaceVerticalStroke)
                .append(atHorizontalStroke)
                .append("\n"));

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}
