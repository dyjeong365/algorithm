import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;
        StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}