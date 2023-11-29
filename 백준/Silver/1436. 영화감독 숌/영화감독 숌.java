import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int numberOfTitle = 666;
        int countOfTitle = 1;

        while (N != countOfTitle) {
            numberOfTitle++;

            if (String.valueOf(numberOfTitle).contains("666")) {
                countOfTitle++;
            }
        }

        System.out.print(numberOfTitle);
    }
}
