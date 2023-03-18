import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(br.readLine());

        for (; number > 0; number--) {
            sb.append(number + "\n");
        }
        System.out.print(sb);
    }
}