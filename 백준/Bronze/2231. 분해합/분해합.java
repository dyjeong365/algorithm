import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        System.out.println(findMinConstructor(N));
    }

    private static int findMinConstructor(int number) {
        for (int i = 1; i < number; i++) {
            String[] input = String.valueOf(i).split("");
            int result = Arrays.stream(input).mapToInt(Integer::parseInt).sum() + i;

            if (result == number) return i;
        }

        return 0;
    }
}
