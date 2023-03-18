import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            String length = st.nextToken();
            if (length.equals("0")) break;

            int A = Integer.parseInt(length);
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int max = A > B ? (A > C ? A : C) : (B < C ? C : B);

            if (A == max) {
                if (Math.pow(max, 2) == Math.pow(B, 2) + Math.pow(C, 2)) sb.append("right\n");
                else sb.append("wrong\n");
            } else if (B == max) {
                if (Math.pow(max, 2) == Math.pow(A, 2) + Math.pow(C, 2)) sb.append("right\n");
                else sb.append("wrong\n");
            } else if (C == max) {
                if (Math.pow(max, 2) == Math.pow(B, 2) + Math.pow(A, 2)) sb.append("right\n");
                else sb.append("wrong\n");
            }
        }
        System.out.print(sb);
    }
}