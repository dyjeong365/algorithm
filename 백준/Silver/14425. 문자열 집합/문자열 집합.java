import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> stringList = new ArrayList<>();
        String[] counts = br.readLine().split(" ");
        int answer = 0;

        final int N = Integer.parseInt(counts[0]);
        final int M = Integer.parseInt(counts[1]);

        for (int i = 0; i < N; i++) {
            stringList.add(br.readLine());
        }

        for (int j = 0; j < M; j++) {
            if (stringList.contains(br.readLine())) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
