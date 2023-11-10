import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] triangle = br.readLine().split(" ");
        int max = Arrays.stream(triangle).mapToInt(Integer::parseInt).max().getAsInt();
        int sum = Arrays.stream(triangle).mapToInt(Integer::parseInt).sum();
        int sumOfOthersExceptMax = sum - max;

        while (max >= (sumOfOthersExceptMax)) {
            max--;
        }

        int result = max + sumOfOthersExceptMax;
        System.out.println(result);
    }
}
