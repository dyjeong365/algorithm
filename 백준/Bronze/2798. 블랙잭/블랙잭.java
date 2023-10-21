import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        final int M = Integer.parseInt(input[1]);

        String[] cards = br.readLine().split(" ");
        int answer = 0;

        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int result = Integer.parseInt(cards[i]) + Integer.parseInt(cards[j]) + Integer.parseInt(cards[k]);

                    if (result <= M) answer = Math.max(answer, result);
                }
            }
        }

        System.out.println(answer);
    }
}
