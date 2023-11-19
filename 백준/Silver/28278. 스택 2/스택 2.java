import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());
        Stack<String> stringStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "1":
                    stringStack.push(st.nextToken());
                    break;
                case "2":
                    sb.append(stringStack.isEmpty() ? -1 : stringStack.pop())
                            .append("\n");
                    break;
                case "3":
                    sb.append(stringStack.size())
                            .append("\n");
                    break;
                case "4":
                    sb.append(stringStack.isEmpty() ? 1 : 0)
                            .append("\n");
                    break;
                case "5":
                    sb.append(stringStack.isEmpty() ? -1 : stringStack.peek())
                            .append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
