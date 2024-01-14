import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BAEKJOON30087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.equalsIgnoreCase("Algorithm")) System.out.println("204");
            if(s.equalsIgnoreCase("DataAnalysis")) System.out.println("207");
            if(s.equalsIgnoreCase("ArtificialIntelligence")) System.out.println("302");
            if(s.equalsIgnoreCase("CyberSecurity")) System.out.println("B101");
            if(s.equalsIgnoreCase("Network")) System.out.println("303");
            if(s.equalsIgnoreCase("Startup")) System.out.println("501");
            if(s.equalsIgnoreCase("TestStrategy")) System.out.println("105");
            //test commit
        }
    }
}
