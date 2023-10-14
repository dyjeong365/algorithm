import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input[] = br.readLine().split(" ");
            int first = Integer.parseInt(input[0]);

            if (first == 0) break;

            int second = Integer.parseInt(input[1]);
            hasRelation(first, second);
        }
    }

    private static void hasRelation(int first, int second) {
        StringBuilder sb = new StringBuilder();

        if (first > second) {
            if (first % second == 0) sb.append("multiple");
            else sb.append("neither");
        } else if (first < second) {
            if (second % first == 0) sb.append("factor");
            else sb.append("neither");
        }

        System.out.println(sb);
    }
}
