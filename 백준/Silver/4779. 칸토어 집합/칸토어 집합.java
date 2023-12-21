import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            N = Integer.parseInt(input);
            int len = (int) Math.pow(3, N);
            sb = new StringBuilder();

            for (int i = 0; i < len; i++) {
                sb.append("-");
            }

            makeCantorianSet(0, len);
            System.out.println(sb);
        }
    }

    private static void makeCantorianSet(int start, int len) {
        if (len < 3) {
            return;
        }

        int dividedBythree = len / 3;

        // 중간 부분
        for (int i = start + dividedBythree; i < start + (dividedBythree * 2); i++) {
            sb.setCharAt(i, ' ');
        }

        // 처음 부분
        makeCantorianSet(start, dividedBythree);

        // 마지막 부분
        makeCantorianSet(start + (dividedBythree * 2), dividedBythree);
    }
}
