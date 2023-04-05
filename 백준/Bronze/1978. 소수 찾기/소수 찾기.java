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
            boolean isPrime = true;
            int input = Integer.parseInt(st.nextToken());

            if (input == 1) continue;

            for (int j = 2; j <= Math.sqrt(input); j++) {
                if (input % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) countOfPrimeNumber++;
        }
        System.out.println(countOfPrimeNumber);
    }
}
