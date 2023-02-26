import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = 0;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        String v = br.readLine();

        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(v)) count += 1;
        }
        System.out.println(count);
    }
}