import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int COUNT_OF_NUMBER = 5;
        int[] numbers = new int[COUNT_OF_NUMBER];

        for (int i = 0; i < COUNT_OF_NUMBER; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        final int AVG = Arrays.stream(numbers).sum() / COUNT_OF_NUMBER;

        Arrays.sort(numbers);

        int median = numbers[2];

        sb.append(AVG)
                .append("\n")
                .append(median);

        System.out.println(sb);
    }
}
