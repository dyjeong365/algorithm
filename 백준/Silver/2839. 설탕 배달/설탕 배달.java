import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(minCount(N));
    }

    private static int minCount(int number) {
        if (number % 5 == 0) return number / 5;

        int result = number / 5;

        while (result != 0) {
            int temp = number - result * 5;

            if (temp % 3 == 0) return result + temp / 3;
            else result--;
        }

        return number % 3 == 0 ? number / 3 : -1;
    }
}
