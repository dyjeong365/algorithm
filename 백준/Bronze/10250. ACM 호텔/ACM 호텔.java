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
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int order = Integer.parseInt(st.nextToken());
            int roomNumber = 0;

            boolean isOverflow = height * width < order;
            boolean isTop = order % height == 0;

            if (isOverflow) break;

            if (isTop) {
                roomNumber += (order / height) + (height * 100);
                sb.append(roomNumber + "\n");
            } else {
                roomNumber += ((int) Math.ceil((double) order / height)) + (order % height) * 100;
                sb.append(roomNumber + "\n");
            }
        }
        System.out.print(sb);
    }
}