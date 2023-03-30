import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(st.nextToken());
        int testcase = Integer.parseInt(st.nextToken());
        int[] basket = new int[count];

        for (int i = 0; i < count; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()) - 1;
            int last = Integer.parseInt(st.nextToken()) - 1;
            for (int j = first; j < last; j++) {
                int temp = basket[j];
                basket[j] = basket[last];
                basket[last] = temp;
                last--;
            }
        }
        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i]);
            if (i != basket.length - 1) sb.append(" ");
        }
        System.out.println(sb);
    }
}