import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ballNumber = Integer.parseInt(st.nextToken());
            for (int j = start - 1; j <= end - 1; j++) {
                basket[j] = ballNumber;
            }
        }
        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i] + " ");
        }
        System.out.println(sb);
    }
}