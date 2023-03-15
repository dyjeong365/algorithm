import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        sb.append(first * ((second % 100) % 10) + "\n");
        sb.append(first * ((second % 100) / 10) + "\n");
        sb.append(first * (second / 100) + "\n");
        sb.append(first * second);

        System.out.println(sb);
    }
}