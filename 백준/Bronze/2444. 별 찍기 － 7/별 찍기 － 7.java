import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final int LINE = 2 * N - 1;

        for (int i = 1; i <= LINE; i += 2) {
            System.out.print(" ".repeat((LINE - i) / 2));
            System.out.print("*".repeat(i));
            System.out.println();
        }

        for (int i = LINE - 2; i >= 1; i -= 2) {
            System.out.print(" ".repeat((LINE - i) / 2));
            System.out.print("*".repeat(i));

            if (i > 1) System.out.println();
        }
    }
}
