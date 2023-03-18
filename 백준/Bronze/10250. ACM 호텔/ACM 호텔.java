import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken()); //6
            int width = Integer.parseInt(st.nextToken()); //12
            int order = Integer.parseInt(st.nextToken()); //8
            int room = 0;

            if ((height * width) < order) break;

            if (order % height == 0) {
                room += (order / height) + (height * 100);
                sb.append(room + "\n");
            } else {
                room += ((int) Math.ceil((double) order / height)) + (order % height) * 100;
                sb.append(room + "\n");
            }
        }
        System.out.print(sb);
    }
}