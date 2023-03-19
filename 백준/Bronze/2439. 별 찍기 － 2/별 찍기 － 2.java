import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int line = Integer.parseInt(br.readLine());
        String star = "*";

        for (int i = 0; i <= line; i++) {
            if (i > 0) {
                sb.append(star + "\n");
                star += "*";
            }
            for (int j = line; j >= i + 2; j--) {
                sb.append(" ");
            }
        }
        System.out.print(sb);
    }
}