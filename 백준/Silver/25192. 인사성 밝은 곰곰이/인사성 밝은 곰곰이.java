import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int answer = 0;
        Set<String> set = new HashSet<>();
        br.readLine();

        for (int i = 1; i < N; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                answer += set.size();
                set.clear();
            } else {
                set.add(input);
            }
        }

        System.out.print(answer + set.size());
    }
}
