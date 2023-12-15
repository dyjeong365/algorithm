import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<int[]> fibonacci = new ArrayList<>();
        final int MAX = 40;

        fibonacci.add(new int[]{1, 0});
        fibonacci.add(new int[]{0, 1});

        for (int i = 2; i <= MAX; i++) {
            fibonacci.add(new int[]{fibonacci.get(i - 1)[0] + fibonacci.get(i - 2)[0],
                    fibonacci.get(i - 1)[1] + fibonacci.get(i - 2)[1]});
        }

        for (int i = 0; i < T; i++) {
            final int N = Integer.parseInt(br.readLine());

            sb.append(fibonacci.get(N)[0])
                    .append(" ")
                    .append(fibonacci.get(N)[1])
                    .append("\n");
        }

        System.out.print(sb);
    }
}
