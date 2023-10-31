import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());
        String[][] people = new String[N][];

        for (int i = 0; i < N; i++) {
            people[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            int weight = Integer.parseInt(people[i][0]);
            int height = Integer.parseInt(people[i][1]);

            for (int j = 0; j < N; j++) {
                int targetWeight = Integer.parseInt(people[j][0]);
                int targetHeight = Integer.parseInt(people[j][1]);

                if (weight < targetWeight && height < targetHeight) {
                    rank++;
                }
            }
            sb.append(rank)
                    .append(" ");
        }

        System.out.println(sb);
    }
}
