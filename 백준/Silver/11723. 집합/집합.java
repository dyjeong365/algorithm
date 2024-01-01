import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        final int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            switch (op) {
                case "add":
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append(set.contains(Integer.parseInt(st.nextToken())) ? "1" : "0").append("\n");
                    break;
                case "toggle":
                    int number = Integer.parseInt(st.nextToken());
                    if (set.contains(number)) {
                        set.remove(number);
                    } else {
                        set.add(number);
                    }
                    break;
                case "all":
                    set.clear();

                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }

                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }

        System.out.print(sb);
    }
}
