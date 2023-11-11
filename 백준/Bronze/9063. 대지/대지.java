import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        String[][] input = new String[N][2];

        for (int i = 0; i < N; i++) {
            input[i] = br.readLine().split(" ");
        }

        int minOfX = Arrays.stream(input).mapToInt(el -> Integer.parseInt(el[0])).min().getAsInt();
        int maxOfX = Arrays.stream(input).mapToInt(el -> Integer.parseInt(el[0])).max().getAsInt();
        int minOfY = Arrays.stream(input).mapToInt(el -> Integer.parseInt(el[1])).min().getAsInt();
        int maxOfY = Arrays.stream(input).mapToInt(el -> Integer.parseInt(el[1])).max().getAsInt();

        int result = (maxOfX - minOfX) * (maxOfY - minOfY);

        System.out.print(result);
    }
}
