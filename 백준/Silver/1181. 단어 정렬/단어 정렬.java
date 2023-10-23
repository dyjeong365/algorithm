import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        list = list.stream()
                .distinct()
                .sorted()
                .sorted((a, b) -> a.length() - b.length())
                .collect(Collectors.toList());

        for (var el : list) {
            sb.append(el)
                    .append("\n");
        }

        System.out.print(sb);
    }
}
