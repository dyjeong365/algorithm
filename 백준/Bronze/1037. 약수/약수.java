import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int NUMBER_OF_DIVISORS = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        final int MIN = Arrays.stream(input).min().getAsInt();
        final int MAX = Arrays.stream(input).max().getAsInt();

        System.out.print(MIN * MAX);
    }
}
