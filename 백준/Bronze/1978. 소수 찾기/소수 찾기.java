import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int countOfPrimeNumber = 0;

        for (int i = 0; i < testcase; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input == 1) continue;
            if (input == 2) {
                countOfPrimeNumber++;
                continue;
            }
            for (int j = 2; j < input; j++) {
                if (input % j == 0) break;
                if (j == input - 1) countOfPrimeNumber++;
            }
        }
        System.out.println(countOfPrimeNumber);
    }
}
