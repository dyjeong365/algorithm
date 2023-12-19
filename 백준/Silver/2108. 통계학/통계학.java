import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }

        Arrays.sort(numbers);

        // 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
        int count = 0;
        int max = -1;
        int mode = numbers[0];
        boolean flag = false;

        for (int i = 0; i < N - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                count++;
            } else {
                count = 0;
            }

            if (max < count) {
                max = count;
                mode = numbers[i];
                flag = true;
            } else if (max == count && flag) {
                mode = numbers[i];
                flag = false;
            }
        }

        // 소수점 이하 첫째 자리에서 반올림한 값
        int arithmeticMean = (int) Math.round((double) sum / N);
        int median = numbers[N / 2];
        int range = numbers[N - 1] - numbers[0];

        sb.append(arithmeticMean)
                .append("\n")
                .append(median)
                .append("\n")
                .append(mode)
                .append("\n")
                .append(range);

        System.out.print(sb);
    }
}
