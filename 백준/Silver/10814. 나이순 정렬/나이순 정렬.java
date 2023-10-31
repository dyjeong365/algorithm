import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());
        String[][] people = new String[N][];

        for (int i = 0; i < N; i++) {
            people[i] = br.readLine().split(" ");
        }

        Arrays.sort(people, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        for (int i = 0; i < N; i++) {
            sb.append(people[i][0])
                    .append(" ")
                    .append(people[i][1])
                    .append("\n");
        }

        System.out.print(sb);
    }
}
