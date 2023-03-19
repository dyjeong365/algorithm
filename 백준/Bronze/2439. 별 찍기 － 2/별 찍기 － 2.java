import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int line = Integer.parseInt(br.readLine());

        for (int i = 1; i <= line; i++) {
            sb.append(" ".repeat(line - i));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}