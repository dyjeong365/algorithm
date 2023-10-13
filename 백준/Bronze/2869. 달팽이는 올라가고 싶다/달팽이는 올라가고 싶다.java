import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int A = Integer.parseInt(st.nextToken());
        final int B = Integer.parseInt(st.nextToken());
        final int V = Integer.parseInt(st.nextToken());
        int answer = (int) Math.ceil((double) (V - B) / (A - B));

        System.out.println(answer);
    }
}
