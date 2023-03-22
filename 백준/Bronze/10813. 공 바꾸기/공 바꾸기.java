import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int previous = Integer.parseInt(st.nextToken());
            int present = Integer.parseInt(st.nextToken());
            int temp = basket[previous - 1];
            basket[previous - 1] = basket[present - 1];
            basket[present - 1] = temp;
        }

        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i] + " ");
        }
        System.out.println(sb);
    }
}