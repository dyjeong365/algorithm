import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        System.out.println(findMinConstructor(N));
    }

    private static int findMinConstructor(int number) {
        for (int i = 1; i < number; i++) {
            char[] input = String.valueOf(i).toCharArray();
            int result = i;

            for (var el : input) {
                result += Character.getNumericValue(el);
            }

            if (result == number) return i;
        }

        return 0;
    }
}
