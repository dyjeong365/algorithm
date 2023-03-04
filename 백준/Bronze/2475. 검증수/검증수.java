import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int unique = 0;

        while (st.hasMoreTokens()) {
            unique = unique + (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

        System.out.println(unique % 10);
    }
}