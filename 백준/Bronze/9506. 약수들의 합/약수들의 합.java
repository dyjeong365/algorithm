import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            isPerfect(n);
        }
    }

    private static void isPerfect(int number) {
        StringBuilder sb = new StringBuilder();
        int sum = 1;

        sb.append(number + " = 1");

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sb.append(" + " + i);
                sum += i;
            }
        }

        if (sum == number) System.out.println(sb);
        else System.out.println(number + " is NOT perfect.");
    }
}
