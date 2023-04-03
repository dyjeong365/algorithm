import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int input = Integer.parseInt(st.nextToken());
                if (max <= input) {
                    max = input;
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        sb.append(max + "\n" + row + " " + column);
        System.out.print(sb);
    }
}
